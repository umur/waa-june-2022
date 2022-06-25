package com.waa.phase1.service;

import com.waa.phase1.entity.Course;

import java.util.List;

public interface CourseService {

    Course findById(Integer id);

    List<Course> findAll();

    Integer create(Course course);

    void update(Integer id, Course course);

    void delete(Integer id);
}
