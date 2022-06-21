package com.lab.phase1.service;

import com.lab.phase1.model.Course;

import java.util.List;

public interface CourseService {

    List<Course> findAll();

    void create(Course course);

    void delete(int id);
}
