package edu.miu.rest.service;

import edu.miu.rest.entity.Course;
import edu.miu.rest.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    List<Student> getStudentsByMajor(String major);
    List<Course> getCoursesByStudentId(int studentId);
    void create(Student entity);
    void delete(int id);
    void update(Student entity,int id);
}
