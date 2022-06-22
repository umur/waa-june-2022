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
        return courseRepository.findAll();
    }

    @Override
    public void createNewCourse(Course course) {
        courseRepository.create(course);
    }

    @Override
    public void updateCourse(Course course, int id) {
        courseRepository.update(id, course);
    }

    @Override
    public void deleteCourse(int id) {
        courseRepository.delete(id);
    }
}
