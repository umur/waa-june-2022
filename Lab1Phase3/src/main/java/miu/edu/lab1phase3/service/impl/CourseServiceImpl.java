package miu.edu.lab1phase3.service.impl;

import lombok.AllArgsConstructor;
import miu.edu.lab1phase3.dto.CourseDto;
import miu.edu.lab1phase3.entity.Course;
import miu.edu.lab1phase3.repo.CourseRepo;
import miu.edu.lab1phase3.service.CourseService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service@AllArgsConstructor
public class CourseServiceImpl implements CourseService {

    private ModelMapper mapper;
    private final CourseRepo courseRepo;



    @Override
    public List<CourseDto> findAll(){
        var courses= courseRepo.findAll();
        var result = new ArrayList<CourseDto>();

        for (Course course : courses) {
            CourseDto dto = new CourseDto();
            CourseDto dto1 = toDto(course);
            result.add(dto1);
        }
        return result;
    }

    @Override
    public void create(CourseDto courseDto){

        Course course = toEntity(courseDto);
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

    public CourseDto toDto(Course course){
        CourseDto courseDto = mapper.map(course, CourseDto.class);
        return courseDto;
    }

    public Course toEntity(CourseDto courseDto){
        Course course = mapper.map(courseDto, Course.class);
        return course;
    }
}
