package rest4.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rest4.DTO.courseDto;
import rest4.entity.course;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class couresServiceimpl implements courseService{
    public final rest4.repository.courseRepository courseRepository;

    @Override
    public void delete(int id) {
       courseRepository.delete(id);
    }

    @Override
    public void save(courseDto s) {
        course course=new course();
        course.setId(s.getId());
        course.setCode(s.getCode());
        course.setName(s.getName());
        courseRepository.save(course);

    }

    @Override
    public List<courseDto> getAll() {
        List<courseDto> DtoEntitiy = new ArrayList<courseDto>();
        List<course> courseEntity = courseRepository.getAll();
        for (course h : courseEntity) {
            courseDto dto = new courseDto();
            dto.setCode(h.getCode());
            dto.setName(h.getName());
            dto.setId(h.getId());
            DtoEntitiy.add(dto);
        }
        return DtoEntitiy;
    }

    @Override
    public courseDto getById(int id) {
        course c=courseRepository.getById(id);;
        courseDto dto=new courseDto();
        dto.setId(c.getId());
        dto.setId(c.getId());
        dto.setId(c.getId());
        return dto;
    }
}
