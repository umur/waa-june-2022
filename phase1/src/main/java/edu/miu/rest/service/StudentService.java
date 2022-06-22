package edu.miu.rest.service;

import edu.miu.rest.entity.Course;
import edu.miu.rest.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAll();
    List<Student> findByMajor(String major);

     List<Course> findCoursesByStudentId(int id);

    Student addStudents(Student studentDto);

    Student updateStudent(Student studentDto);

    void deleteStudentById(int id);
}
