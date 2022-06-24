package com.example.rest.phaseIV.repo;

import com.example.rest.phaseIV.entity.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CourseRepo {
    private static List<Course> courses = new ArrayList<>();

    public CourseRepo() {
        Course c1 = new Course(1, "waa", "cs000");
        Course c2 = new Course(2, "mwa", "cs001");
        courses.add(c1);
        courses.add(c2);

    }

    public List<Course> findAll() {
        return courses;
    }


}
