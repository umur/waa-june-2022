package com.Lab02.Assignment.Phase1.service;

import com.Lab02.Assignment.Phase1.entity.Student;

import java.util.List;


public interface StudentService {

    List<Student> getAllStudents();
    void saveStudent(Student S);
    void delete(int id);

    void update(Student s, int id);

}
