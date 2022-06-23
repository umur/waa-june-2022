package rest.cs545_waa_lab2_frontend.service;

import rest.cs545_waa_lab2_frontend.dto.CourseDto;
import rest.cs545_waa_lab2_frontend.entity.Course;

import java.util.List;

public interface CourseService {

    public List<CourseDto> getCoursesByStudentId(int StudentId);

    public List<CourseDto> getAllCourses();
}
