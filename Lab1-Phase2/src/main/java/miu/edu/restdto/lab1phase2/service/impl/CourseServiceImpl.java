package miu.edu.restdto.lab1phase2.service.impl;

import lombok.AllArgsConstructor;
import miu.edu.restdto.lab1phase2.dto.CourseDto;
import miu.edu.restdto.lab1phase2.entity.Course;
import miu.edu.restdto.lab1phase2.repo.CourseRepo;
import miu.edu.restdto.lab1phase2.service.CourseService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service@AllArgsConstructor
public class CourseServiceImpl implements CourseService {
    private final CourseRepo courseRepo;

    @Override
    public List<CourseDto> findAll(){
        var courses= courseRepo.findAll();
        var result = new ArrayList<CourseDto>();

        for (Course course : courses) {
            CourseDto dto = new CourseDto();
            CourseDto dto1 = dto.toDto(course);
            result.add(dto1);
        }
        return result;
    }

    @Override
    public void create(CourseDto dto){

        Course course = dto.toEntity();
        courseRepo.create(course);

    }

    @Override
    public void delete(int id){
        courseRepo.delete(id);

    }

    @Override
    public void update(int id, CourseDto dto){
        Course course = dto.toEntity();
        courseRepo.update(id, course);
    }
}
