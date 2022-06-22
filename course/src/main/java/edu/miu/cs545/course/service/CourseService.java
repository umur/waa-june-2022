package edu.miu.cs545.course.service;

import edu.miu.cs545.course.entity.Course;

import java.util.List;

public interface CourseService {
    void createNewCourse(Course course);
    List<Course> findAllCourses();
    void updateCourse(Course course, int id);
    void deleteCourse(int id);
}
