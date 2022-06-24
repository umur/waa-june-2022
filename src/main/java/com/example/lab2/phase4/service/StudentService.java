package com.example.lab2.phase4.service;

import com.example.lab2.phase4.DTO.StudentDTO;

import java.util.List;

public interface StudentService {
    public List<StudentDTO> getStudentsByMajor(String major);
    public List<StudentDTO> findAll();
    void createStudent(StudentDTO studentDTO);
    void updateStudent(StudentDTO studentDTO);
    void deleteStudent(int id);
}
