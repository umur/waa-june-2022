package com.lab.phase3.service;

import com.lab.phase3.dto.CourseDto;
import com.lab.phase3.dto.StudentDto;
import com.lab.phase3.model.Course;

import java.util.List;

public interface StudentService {

    List<StudentDto> findAll();

    void create(StudentDto dto);

    void delete(int id);

    StudentDto update(StudentDto dto, int id);

    List<StudentDto> findByMajor(String major);

    List<CourseDto> findCoursesByStudentId(int id);
}
