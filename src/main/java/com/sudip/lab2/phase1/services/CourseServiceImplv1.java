package com.sudip.lab2.phase1.services;

import com.sudip.lab2.phase1.entity.Course;
import com.sudip.lab2.phase1.repository.CourseRepositoryv1;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CourseServiceImplv1 implements CourseServicev1 {
    private final CourseRepositoryv1 courseRepository;

    @Override
    public void create(Course course) {
        courseRepository.create(course);
    }

    @Override
    public List<Course> findAll() {
        return courseRepository.findAll();
    }

    @Override
    public void update(Course course, int id) {
        courseRepository.update(course, id);
    }

    @Override
    public void remove(int id) {
        courseRepository.remove(id);
    }
}
