package edu.miu.cs545.course.service;

import edu.miu.cs545.course.entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> findAllCourses();
    void createNewCourse(Course course);
    Course updateCourse(Course course);
    void deleteCourse(Course course);
}
