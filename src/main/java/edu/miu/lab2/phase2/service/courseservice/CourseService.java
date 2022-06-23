package edu.miu.lab2.phase2.service.courseservice;

import edu.miu.lab2.phase2.dto.CourseDto;
import edu.miu.lab2.phase2.entity.Course;

import java.util.List;

public interface CourseService {
    public List<CourseDto> getCourseDto();

    public void createCourse(CourseDto courseDto);

    public void deleteCourse(int id);

    public void updateCourse(CourseDto c, int id);
}
