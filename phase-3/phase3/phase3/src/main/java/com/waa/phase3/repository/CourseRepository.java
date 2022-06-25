package com.waa.phase3.repository;

import com.waa.phase3.entity.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

@Repository
public class CourseRepository {

    private List<Course> courses = new ArrayList<>();

    public CourseRepository() {
        courses.add(new Course(1, "WAP", "CS472"));
        courses.add(new Course(2, "WAA", "CS545"));
    }

    public Course findById(Integer id) {
        return courses.stream()
                .filter(it -> Objects.equals(it.getId(), id))
                .findFirst()
                .orElse(null);
    }

    public Integer save(Course course) {
        Integer id = Math.abs(new Random().nextInt() % 1000);
        course.setId(id);
        courses.add(course);
        return id;
    }

    public void update(Integer id, Course course) {
        Course db = courses.stream()
                .filter(it -> it.getId() == id)
                .findFirst()
                .orElseThrow(RuntimeException::new);

        db.setCode(course.getCode());
        db.setName(course.getName());
    }

    public void delete(Integer id) {
        courses.removeIf(it -> it.getId() == id);
    }

    public List<Course> findAll() {
        return courses;
    }
}