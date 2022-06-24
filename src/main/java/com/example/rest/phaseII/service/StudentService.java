package com.example.rest.phaseII.service;

import com.example.rest.phaseII.dto.StudentDto;
import com.example.rest.phaseII.entity.Student;

public interface StudentService {
   void createStudent(StudentDto studentDto);
    void deleteStudent(Student s);
    Student getStudent(int id);
    void update(Student s);



}
