package edu.miu.lab2.phase3.service.courseservice;

import edu.miu.lab2.phase3.dto.CourseDtoP3;

import java.util.List;

public interface CourseService {
    public List<CourseDtoP3> getCourseDto();

    public void createCourse(CourseDtoP3 courseDto);

    public void deleteCourse(int id);

    public void updateCourse(CourseDtoP3 c, int id);
}
