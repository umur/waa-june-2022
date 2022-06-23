package com.Lab02.Assignment.Phase4.service;

import com.Lab02.Assignment.Phase4.dtos.StudentDto;

import java.util.List;


public interface StudentService4 {

    List<StudentDto> getAllStudents();
    void saveStudent(StudentDto S);
    void delete(int id);

    void update(StudentDto s, int id);

}
