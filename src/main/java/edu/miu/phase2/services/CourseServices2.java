package edu.miu.phase2.services;

import edu.miu.phase2.dto.CourseDto;

import java.util.List;

public interface CourseServices2 {

    List<CourseDto> getCourses();

    void updateCourse(CourseDto course, int id);

    void addCourse(CourseDto course);

    void deleteCourse(int id);
}
