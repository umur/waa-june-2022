package com.example.rest.phaseIV.service;

import com.example.rest.phaseIV.dto.StudentDto;
import com.example.rest.phaseIV.entity.Student;

public interface StudentService {
   void createStudent(StudentDto studentDto);
    void deleteStudent(StudentDto studentDto);
    Student getStudent(int id);
    void update(StudentDto studentDto);



}
