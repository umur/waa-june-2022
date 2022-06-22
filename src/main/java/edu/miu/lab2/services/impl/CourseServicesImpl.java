package edu.miu.lab2.services.impl;

import edu.miu.lab2.entity.Course;
import edu.miu.lab2.repository.CourseRepo;
import edu.miu.lab2.services.CourseServices;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CourseServicesImpl implements CourseServices {

    private final CourseRepo courseRepo;

    @Override
    public List<Course> getCourses() {
        return courseRepo.getCourses();
    }

    @Override
    public void updateCourse(Course course, int id) {
        courseRepo.updateCourse(course, id);
    }

    @Override
    public void addCourse(Course course) {
        this.courseRepo.addCourse(course);
    }

    @Override
    public void deleteCourse(int id) {
        this.courseRepo.deleteCourse(id);
    }
}
