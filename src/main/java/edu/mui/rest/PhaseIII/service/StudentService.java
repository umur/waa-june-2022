package edu.mui.rest.PhaseIII.service;

import edu.mui.rest.PhaseIII.dto.StudentDto;
import edu.mui.rest.PhaseIII.entity.Course;
import edu.mui.rest.PhaseIII.entity.Student;

import java.util.ArrayList;
import java.util.List;

public interface StudentService {

    ArrayList<StudentDto> findAll();
    ArrayList<StudentDto> findByMajor(String major);

     List<Course> findCoursesByStudentId(int id);

    Student addStudents(StudentDto studentDto);

    Student updateStudent(StudentDto studentDto);

    void deleteStudentById(int id);
}
