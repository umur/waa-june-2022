package rest.cs545_waa_lab2.service;

import rest.cs545_waa_lab2.entity.Course;

import java.util.List;

public interface CourseService {

    public  List<Course> getCoursesByStudentId(int StudentId);

    public Course addCourse(Course c);

}
