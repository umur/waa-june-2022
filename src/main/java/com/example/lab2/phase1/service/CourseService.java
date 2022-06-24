package com.example.lab2.phase1.service;

import com.example.lab2.phase1.entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> getCoursesByStudentId(int studentId);
    List<Course> findAll();
}
