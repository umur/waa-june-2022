package com.example.rest.phaseI.service;

import com.example.rest.phaseI.entity.Student;

public interface StudentService {
   // void createStudent();
    void deleteStudent(Student s);
    Student getStudent(int id);
    void update(Student s);



}
