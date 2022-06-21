package com.lab.phase1.service;

import com.lab.phase1.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();

    void create(Student student);
}
