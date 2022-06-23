package com.lab.phase2.repo;

import com.lab.phase2.model.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepo {
    private static List<Course> courses = new ArrayList<>();

    public CourseRepo() {
        Course c1 = new Course(1,"WAA", "CS545");
        Course c2 = new Course(2,"WAP","CS472");
        courses.add(c1);
        courses.add(c2);
    }

    public List<Course> findAll() {
        return courses;
    }

    public void create(Course course) {
        courses.add(course);
    }

    public void delete(int id) {
        var found = courses.stream().filter(c-> c.getId() == id).findFirst().get();
        courses.remove(found);
    }

    public void update(Course newCourse, int id) {
        Course oldCourse = findAll().stream()
                .filter(c-> c.getId() == id)
                .findFirst().get();
        oldCourse.setCode(newCourse.getCode());
        oldCourse.setName(newCourse.getName());
    }

}
