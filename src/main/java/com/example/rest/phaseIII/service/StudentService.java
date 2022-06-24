package com.example.rest.phaseIII.service;

import com.example.rest.phaseIII.dto.StudentDto;
import com.example.rest.phaseIII.entity.Student;

public interface StudentService {
   void createStudent(StudentDto studentDto);
    void deleteStudent(StudentDto studentDto);
    Student getStudent(int id);
    void update(StudentDto studentDto);

}
