package com.Lab02.Assignment.Phase3.service;

import com.Lab02.Assignment.Phase3.dtos.StudentDto;

import java.util.List;


public interface StudentService3 {

    List<StudentDto> getAllStudents();
    void saveStudent(StudentDto S);
    void delete(int id);

    void update(StudentDto s, int id);

}
