package com.waa.phase1.service.impl;

import com.waa.phase1.entity.Course;
import com.waa.phase1.repository.CourseRepository;
import com.waa.phase1.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    @Override
    public Course findById(Integer id) {
        return courseRepository.findById(id);
    }

    @Override
    public List<Course> findAll() {
        return courseRepository.findAll();
    }

    @Override
    public Integer create(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public void update(Integer id, Course course) {
        courseRepository.update(id, course);
    }

    @Override
    public void delete(Integer id) {
        courseRepository.delete(id);
    }
}
