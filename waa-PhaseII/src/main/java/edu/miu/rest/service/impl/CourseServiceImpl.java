package edu.miu.rest.service.impl;

import edu.miu.rest.dto.CourseDto;
import edu.miu.rest.dto.StudentDto;
import edu.miu.rest.entity.Course;
import edu.miu.rest.entity.Student;
import edu.miu.rest.repo.CourseRepo;
import edu.miu.rest.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {

    private final CourseRepo courseRepo;

    @Override
    public List<CourseDto> findAll() {
        var courses = courseRepo.findAll();
        var result = new ArrayList<CourseDto>();

        for (Course course : courses) {
            CourseDto dto = new CourseDto();
            var courseDto = dto.toDto(course);
            result.add(courseDto);
        }
        return result;
    }

    @Override
    public void create(CourseDto dto) {
       var entity = dto.toEntity();
        courseRepo.create(entity);
    }

    @Override
    public void delete(int id) {
        List<CourseDto> courseDtoList = findAll();
        for(CourseDto dto:courseDtoList){
            if(id == dto.getId()){
                courseRepo.delete(dto.toEntity());
                break;
            }
        }
    }

    @Override
    public void update(CourseDto dto,int id) {
        List<CourseDto> courseDtoList = findAll();
        List<Course> courseList = new ArrayList<>();
        for(CourseDto courseDto:courseDtoList){
            if(id == courseDto.getId()){
                courseDto = dto;
            }
            var entity = courseDto.toEntity();
            courseList.add(entity);
        }
        courseRepo.update(courseList);
    }

}
