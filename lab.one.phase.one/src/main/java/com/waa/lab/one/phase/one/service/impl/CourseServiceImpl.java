package com.waa.lab.one.phase.one.service.impl;

import com.waa.lab.one.phase.one.entiry.Course;
import com.waa.lab.one.phase.one.repo.CourseRepository;
import com.waa.lab.one.phase.one.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    @Override
    public List<Course> findAll() {
        return courseRepository.findAll();
    }

    @Override
    public Course findById(Long id) {
        return courseRepository.findById(id);
    }

    @Override
    public Long create(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public void update(Long id, Course course) {
        courseRepository.update(id, course);
    }

    @Override
    public void delete(Long id) {
        courseRepository.delete(id);
    }
}
