package com.Lab02.Assignment.Phase2.service;

import com.Lab02.Assignment.Phase2.dtos.StudentDto;
import com.Lab02.Assignment.Phase2.entity.Student;

import java.util.List;


public interface StudentService2 {

    List<StudentDto> getAllStudents();
    void saveStudent(StudentDto S);
    void delete(int id);

    void update(StudentDto s, int id);

}
