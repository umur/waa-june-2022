package miu.edu.phasei.service;

import miu.edu.phasei.entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> findAll();
    Course findOne(int id);
    Course create(Course course);
    Course update(Course course, int id);
    void delete(int id);
}
