package com.phase4.repository;

import com.phase4.domain.Course;
import com.phase4.dto.CourseDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepo {

    private static List<Course> courses = new ArrayList<>();

    static {
        courses.add(new Course(1L,"WAA","CS-543"));
        courses.add(new Course(2L,"MWA","CS-546"));
    }

    public Course save(Course course) {
        courses.add(course);
        return course;
    }

    public Course update(Long id, Course course) {
        Course oldCourse = courses.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if(oldCourse != null) {
            courses.remove(oldCourse);
            course.setId(id);
            courses.add(course);
            return course;
        }

        return null;
    }

    public Course delete(Long id) {
        Course course = courses.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if(course != null) {
            courses.remove(course);
            return course;
        }

        return null;
    }

    public Course getByPK(Long id) {
        return courses.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
    }

    public List<Course> getAll() {
        return courses;
    }
}
