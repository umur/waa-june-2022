package com.example.demowaa.service;

import com.example.demowaa.Dto.CourseDto;
import com.example.demowaa.Entity.Course;
import com.example.demowaa.repository.CourseRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class CourseService implements Icourseservive{
    @Autowired
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
    public String delete(int id){
        var courses=courseRepo.findAll();
        for(Course c:courses) {
            if (!Objects.equals(id, c.getId())) {
                throw new IllegalArgumentException("not found with the given id");
            }
            courseRepo.delete(id);
        }
        return "deleted";
    }
    @Override
    public boolean update(CourseDto c,int id){
        var courses=courseRepo.findAll();
        for(Course c1:courses) {
            if (!Objects.equals(id, c1.getId())) {
                throw new IllegalArgumentException("not found with the given id");
            }
            else if(c1.getId()==id) {
                Course course=c.toEntity();
                courseRepo.update(course, id);
            }
        }
        return true;
    }
}
