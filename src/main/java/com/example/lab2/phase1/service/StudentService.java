package com.example.lab2.phase1.service;

import com.example.lab2.phase1.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getStudentsByMajor(String major);
    public List<Student> findAll();
}
