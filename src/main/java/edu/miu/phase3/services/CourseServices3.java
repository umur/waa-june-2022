package edu.miu.phase3.services;

import edu.miu.phase3.dto.CourseDto;

import java.util.List;

public interface CourseServices3 {

    List<CourseDto> getCourses();

    void updateCourse(CourseDto course, int id);

    void addCourse(CourseDto course);

    void deleteCourse(int id);
}
