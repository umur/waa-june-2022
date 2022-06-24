package com.example.lab2.phase3.repository;


import com.example.lab2.phase3.entity.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class CourseRepository {
    private static final List<Course> courseList = new ArrayList<>();

    public CourseRepository() {
        Course WAA = new Course(1, "WAA", "CS545");
        Course ASD = new Course(2, "ASD", "CS525");
        courseList.add(WAA);
        courseList.add(ASD);
    }

    //create
    public void create(Course course) {
        courseList.add(course);
    }

    //retrieve
    public List<Course> findAll() {
        return courseList;
    }

    public List<Course> findAllCoursesByStudentId(int id) {
        return courseList.stream().filter(e -> e.getId().equals(id)).collect(Collectors.toList());
    }


    //update the course
    public void updateCourse(Course course) {
        if (hasCourse(course)) {
            Course getCourse = courseList.get(course.getId());
            //update the current course;
        }
    }

    //delete the course
    public void deleteCourse(int id) {
        Optional<Course> course = courseList.stream()
                .filter( e -> e.getId().equals(id))
                .findFirst();
        courseList.remove(course);
    }

    //checking we have this course or not
    public Boolean hasCourse(Course course) {
        return courseList.contains(course);
    }

}
