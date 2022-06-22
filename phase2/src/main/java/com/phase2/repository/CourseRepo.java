package com.phase2.repository;

import com.phase2.domain.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepo {

    private static List<Course> courses = new ArrayList<>();;

    static {
        courses.add(new Course(1L,"WAA","CS-543"));
        courses.add(new Course(2L,"MWA","CS-546"));
    }

    public Course insert(Course course) {
        courses.add(course);
        return course;
    }

    public Course update(Long id, Course course) {
        Course course1 = courses.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if(course1 != null) {
            courses.remove(course1);
            course.setId(id);
            courses.add(course);
            return course;
        }

        return null;
    }

    public Course delete(int id) {
        Course course = courses.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if(course != null) {
            courses.remove(course);
            return course;
        }

        return null;
    }

    public Course getByPK(int id) {
        return courses.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
    }
}
