package com.lab.phase3.service.impl;

import com.lab.phase3.dto.CourseDto;
import com.lab.phase3.model.Course;
import com.lab.phase3.repo.CourseRepo;
import com.lab.phase3.service.CourseService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {
    private final CourseRepo courseRepo;
    private final ModelMapper mapper;

    @Override
    public List<CourseDto> findAll() {
        var courses = courseRepo.findAll();
        var result = new ArrayList<CourseDto>();

        for (Course course: courses) {
            CourseDto dto = new CourseDto();
            var courseDto = mapper.map(course, CourseDto.class);
            result.add(courseDto);
        }
        return result;
    }

    @Override
    public void create(CourseDto courseDto) {
        var entity = courseDto.toEntity();
        courseRepo.create(mapper.map(entity, Course.class));
    }

    @Override
    public void delete(int id) {
        courseRepo.delete(id);
    }

    @Override
    public CourseDto update(CourseDto courseDto, int id) {
        Course course = mapper.map(courseDto, Course.class);
        course.setName(courseDto.getName());
        course.setCode(courseDto.getCode());
        courseRepo.update(course, id);
        return courseDto;
    }
}
