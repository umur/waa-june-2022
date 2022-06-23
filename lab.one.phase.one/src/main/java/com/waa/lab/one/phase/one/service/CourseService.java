package com.waa.lab.one.phase.one.service;

import com.waa.lab.one.phase.one.entiry.Course;

import java.util.List;

public interface CourseService {

    public Course findById(Long id);

    public List<Course> findAll();

    public Long create(Course course);

    public void update(Long id, Course course);

    void delete(Long id);
}
