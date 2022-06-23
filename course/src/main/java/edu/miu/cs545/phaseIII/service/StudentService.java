package edu.miu.cs545.phaseIII.service;


import edu.miu.cs545.phaseIII.dto.StudentDto;
import edu.miu.cs545.phaseIII.entity.Course;

import java.util.List;

public interface StudentService {
    StudentDto createNewStudent(StudentDto studentDto);
    List<StudentDto> getAllStudents();
    StudentDto updateStudent(StudentDto studentDto, int id);
    StudentDto deleteStudent(int id);
    List<StudentDto> getStudentsByMajor(String major);
    List<Course> getCoursesByStudentId(int id);
}
