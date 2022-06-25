package edu.miu.cs545.phaseII.service;

import edu.miu.cs545.phaseII.dto.CourseDto;

import java.util.List;

public interface CourseService {
    CourseDto createNewCourse(CourseDto courseDto);
    List<CourseDto> findAllCourses();
    CourseDto updateCourse(CourseDto course, int id);
    CourseDto deleteCourse(int id);
}
