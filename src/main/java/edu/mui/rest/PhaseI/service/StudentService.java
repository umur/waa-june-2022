package edu.mui.rest.PhaseI.service;

import edu.mui.rest.PhaseI.entity.Course;
import edu.mui.rest.PhaseI.entity.Student;

import java.util.ArrayList;
import java.util.List;

public interface StudentService {

    List<Student> findAll();
    List<Student> findByMajor(String major);

     List<Course> findCoursesByStudentId(int id);

    Student addStudents(Student studentDto);

    Student updateStudent(Student studentDto);

    void deleteStudentById(int id);
}
