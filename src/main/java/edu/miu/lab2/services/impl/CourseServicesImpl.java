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
        return null;
    }

    @Override
    public boolean updateCourse(Course course, int id) {
        return false;
    }

    @Override
    public void addCourse(Course course) {

    }

    @Override
    public int deleteCourse(int id) {
        return 0;
    }
}
