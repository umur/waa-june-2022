package com.lab.phase2.service;

import com.lab.phase2.dto.StudentDto;
import com.lab.phase2.model.Course;

import java.util.List;

public interface StudentService {
    List<StudentDto> findAll();

    void create(StudentDto dto);

    void delete(int id);

    StudentDto update(StudentDto dto, int id);

    List<StudentDto> findByMajor(String major);

    List<Course> findCoursesByStudentId(int id);
}
