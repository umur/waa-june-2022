package edu.miu.cs545.course.service;

import edu.miu.cs545.course.entity.Course;
import edu.miu.cs545.course.entity.Student;

import java.util.List;

public interface StudentService {
    void createNewStudent(Student student);
    List<Student> findAllStudent();
    void updateStudent(Student student, int id);
    void deleteStudent(int id);
}
