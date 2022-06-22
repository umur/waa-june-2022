package edu.miu.cs545.course.service;

import edu.miu.cs545.course.entity.Course;
import edu.miu.cs545.course.entity.Student;

import java.util.List;

public interface StudentService {
    void createNewStudent(Student student);
    List<Student> getAllStudents();
    void updateStudent(Student student, int id);
    void deleteStudent(int id);
    List<Student> getStudentsByMajor(String major);
    List<Course> getCoursesByStudentId(int id);
}
