package edu.miu.rest.service;

import edu.miu.rest.dto.CourseDto;
import edu.miu.rest.dto.StudentDto;

import java.util.List;

public interface StudentService {
    List<StudentDto> findAll();
    List<StudentDto> getStudentsByMajor(String major);
    List<CourseDto> getCoursesByStudentId(int studentId);
    void create(StudentDto dto);
    void delete(int id);
    void update(StudentDto dto,int id);
}
