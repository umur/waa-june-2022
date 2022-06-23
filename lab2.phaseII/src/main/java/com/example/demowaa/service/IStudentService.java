package com.example.demowaa.service;

import com.example.demowaa.Dto.CourseDto;
import com.example.demowaa.Dto.StudentDto;

import java.util.List;

public interface IStudentService {
    List<StudentDto> findAll();
    void create(StudentDto dto);
    String delete(int id);
    boolean update(StudentDto c,int id);
}
