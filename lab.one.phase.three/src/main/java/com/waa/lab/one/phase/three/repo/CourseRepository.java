package com.waa.lab.one.phase.three.repo;

import com.waa.lab.one.phase.three.entiry.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

@Repository
public class CourseRepository {

    private List<Course> courses = new ArrayList<>();

    public CourseRepository() {
        courses.add(new Course(1L, "WAA", "CS555"));
        courses.add(new Course(2L, "EA", "CS999"));
    }

    public Course findById(Long id) {
        return courses.stream()
                .filter(it -> Objects.equals(it.getId(), id))
                .findFirst()
                .orElse(null);
    }

    public Long save(Course course) {
        Long id = Math.abs(new Random().nextLong() % 1000);
        course.setId(id);
        courses.add(course);
        return id;
    }

    public void update(Long id, Course course) {
        Course db = courses.stream()
                .filter(it -> it.getId() == id)
                .findFirst()
                .orElseThrow(RuntimeException::new);

        db.setCode(course.getCode());
        db.setName(course.getName());
    }

    public void delete(Long id) {
        courses.removeIf(it -> it.getId() == id);
    }

    public List<Course> findAll() {
        return courses;
    }
}
