package edu.miu.rest.service;

import edu.miu.rest.dto.CourseDto;
import edu.miu.rest.dto.StudentDto;
import edu.miu.rest.entity.Course;
import edu.miu.rest.entity.Student;

import java.util.List;

public interface StudentService {

    List<StudentDto> findAll();
    void create(StudentDto student);
    void update(StudentDto  Student);
    void delete (StudentDto student);
    List <StudentDto> getStudentsByMajor(String major);
    List<CourseDto> getCoursesByStudentId(int studentId);
}
