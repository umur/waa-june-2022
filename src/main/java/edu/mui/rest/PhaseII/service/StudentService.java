package edu.mui.rest.PhaseII.service;

import edu.mui.rest.PhaseII.dto.StudentDto;
import edu.mui.rest.PhaseII.entity.Course;
import edu.mui.rest.PhaseII.entity.Student;


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
