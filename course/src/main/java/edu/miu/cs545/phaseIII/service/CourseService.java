package edu.miu.cs545.phaseIII.service;

import edu.miu.cs545.phaseIII.dto.CourseDto;

import java.util.List;

public interface CourseService {
    CourseDto createNewCourse(CourseDto courseDto);
    List<CourseDto> findAllCourses();
    CourseDto updateCourse(CourseDto course, int id);
    CourseDto deleteCourse(int id);
}
