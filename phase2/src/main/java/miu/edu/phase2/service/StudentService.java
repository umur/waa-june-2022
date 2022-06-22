package miu.edu.phase2.service;

import miu.edu.phase2.dto.CourseDto;
import miu.edu.phase2.dto.StudentDto;
import miu.edu.phase2.entity.Course;

import java.util.List;

public interface StudentService {
    List<StudentDto> findAll();
    StudentDto findOne(int id);
    StudentDto create(StudentDto student);
    StudentDto update(StudentDto student, int id);
    void delete(int id);
    List<StudentDto> getStudentsByMajor(String major);
    List<CourseDto> getCoursesByStudentId(int id);
}
