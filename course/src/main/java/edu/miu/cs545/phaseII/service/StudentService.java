package edu.miu.cs545.phaseII.service;


import edu.miu.cs545.phaseII.dto.StudentDto;
import edu.miu.cs545.phaseII.entity.Course;

import java.util.List;

public interface StudentService {
    StudentDto createNewStudent(StudentDto studentDto);
    List<StudentDto> getAllStudents();
    StudentDto updateStudent(StudentDto studentDto, int id);
    StudentDto deleteStudent(int id);
    List<StudentDto> getStudentsByMajor(String major);
    List<Course> getCoursesByStudentId(int id);
}
