package com.example.lab2.phase2.service;

import com.example.lab2.phase2.DTO.CourseDTO;

import java.util.List;

public interface CourseService {
    List<CourseDTO> getCoursesByStudentId(int studentId);
    List<CourseDTO> findAll();
    void createCourse(CourseDTO course);
    void updateCourse(CourseDTO course);
    void deleteCourse(int id);
}
