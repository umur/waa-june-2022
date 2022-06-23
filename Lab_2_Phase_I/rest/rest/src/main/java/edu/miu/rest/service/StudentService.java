package edu.miu.rest.service;

import edu.miu.rest.entity.Course;
import edu.miu.rest.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAll();
    void create(Student student);
    void update(Student  Student);
    void delete (Student student);
    List <Student> getStudentsByMajor(String major);
    List<Course> getCoursesByStudentId(int studentId);
}
