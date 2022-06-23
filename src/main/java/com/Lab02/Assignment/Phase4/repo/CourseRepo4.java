package com.Lab02.Assignment.Phase4.repo;

import com.Lab02.Assignment.Phase4.client.js.entity.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepo4 {

    private static List<Course> courses = new ArrayList<>();

    public CourseRepo4() {
        Course c1 = new Course(1, "WAA", "CS545");
        Course c2 = new Course(2, "WAP", "CS472");


        courses.add(c1);
        courses.add(c2);
    }

    public List<Course> findAll() {
        return courses;
    }
}
