package com.sudip.lab2.phase1.services;



import com.sudip.lab2.phase1.entity.Course;

import java.util.List;

public interface CourseServicev1 {
    void create(Course course);

    List<Course> findAll();

    void update(Course course, int id);

    void remove(int id);

}
