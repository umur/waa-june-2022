package com.example.lab2.phase1.service;

import com.example.lab2.phase1.entity.Course;
import com.example.lab2.phase1.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    private final CourseRepository courseRepository;

    @Autowired
    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<Course> getCoursesByStudentId(int studentId) {
        return courseRepository.findAllCoursesByStudentId(studentId);
    }

    @Override
    public List<Course> findAll() {
        return courseRepository.findAll();
    }
}
