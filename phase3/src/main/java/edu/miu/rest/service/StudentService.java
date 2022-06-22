package edu.miu.rest.service;

import edu.miu.rest.dto.StudentDto;
import edu.miu.rest.entity.Course;
import edu.miu.rest.entity.Student;

import java.util.List;

public interface StudentService {

    List<StudentDto> findAll();
    List<StudentDto> findByMajor(String major);
    List<Course> findCoursesByStudentId(int id);
    void addStudent(StudentDto studentDto);
    Student updateStudent(StudentDto studentDto);
    void deleteStudentById(int id);
}
