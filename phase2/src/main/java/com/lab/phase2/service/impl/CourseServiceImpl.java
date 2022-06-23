package com.lab.phase2.service.impl;

import com.lab.phase2.dto.CourseDto;
import com.lab.phase2.model.Course;
import com.lab.phase2.repo.CourseRepo;
import com.lab.phase2.service.CourseService;
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

        for (Course course: courses) {
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
        courseRepo.delete(id);
    }

    @Override
    public CourseDto update(CourseDto courseDto, int id) {
        Course course = new Course();
        course.setName(courseDto.getName());
        course.setCode(courseDto.getCode());
        courseRepo.update(course, id);
        return courseDto;
    }





}
