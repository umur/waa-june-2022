package edu.miu.cs545.course.service.impl;

import edu.miu.cs545.course.entity.Course;
import edu.miu.cs545.course.repository.CourseRepository;
import edu.miu.cs545.course.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {
    private final CourseRepository courseRepository;

    @Override
    public List<Course> findAllCourses() {
        return null;
    }

    @Override
    public void createNewCourse(Course course) {

    }

    @Override
    public Course updateCourse(Course course) {
        return null;
    }

    @Override
    public void deleteCourse(Course course) {

    }
}
