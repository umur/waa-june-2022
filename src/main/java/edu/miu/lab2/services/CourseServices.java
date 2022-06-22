package edu.miu.lab2.services;

import edu.miu.lab2.entity.Course;

import java.util.List;

public interface CourseServices {

    List<Course> getCourses();

    void updateCourse(Course course, int id);

    void addCourse(Course course);

    void deleteCourse(int id);
}
