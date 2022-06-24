package phaseI.miu.cs545.course.service;

import phaseI.miu.cs545.course.entity.CourseDto;

import java.util.List;

public interface CourseService {
    void createNewCourse(CourseDto course);
    List<CourseDto> findAllCourses();
    void updateCourse(CourseDto course, int id);
    void deleteCourse(int id);
}
