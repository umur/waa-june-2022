package rest.cs545_waa_lab2_dto.service;


import rest.cs545_waa_lab2_dto.dto.CourseDto;
import rest.cs545_waa_lab2_dto.entity.Course;

import java.util.List;

public interface CourseService {

    public  List<CourseDto> getCoursesByStudentId(int StudentId);

    public List<CourseDto> getAllCourses();

}
