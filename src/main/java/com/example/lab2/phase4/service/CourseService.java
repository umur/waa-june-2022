package com.example.lab2.phase4.service;


import com.example.lab2.phase4.DTO.CourseDTO;

import java.util.List;

public interface CourseService {
    List<CourseDTO> getCoursesByStudentId(int studentId);
    List<CourseDTO> findAll();
    void createCourse(CourseDTO course);
    void updateCourse(CourseDTO course);
    void deleteCourse(int id);
}
