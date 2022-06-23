package com.sudip.lab2.phase2.repository;

import com.sudip.lab2.phase2.entity.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepository {
    private List<Course> courseList = new ArrayList<>();

    public CourseRepository() {
        Course course1 = new Course(1, "WAA", "CS545");
        Course course2 = new Course(2, "WAP", "CS445");
        courseList.add(course1);
        courseList.add(course2);
    }

    public void create(Course course) {
        courseList.add(course);
    }

    public List<Course> findAll() {
        return courseList;
    }

    public void update(Course course, int id) {
        courseList.forEach(course1 -> {
            if (course1.getId() == id) {
                courseList.set(courseList.indexOf(course1), course);
            }
        });

    }

    public void remove(int id) {
        for (Course course : courseList) {
            if (course.getId() == id) {
                courseList.remove(course);
            }
        }
    }


}
