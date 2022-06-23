package com.lab.phase1.service;

import com.lab.phase1.model.Course;
import com.lab.phase1.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();

    void create(Student student);

    void delete(int id);

    List<Student> findByMajor(String major);

    List<Course> findByIdCourses(int id);
}
