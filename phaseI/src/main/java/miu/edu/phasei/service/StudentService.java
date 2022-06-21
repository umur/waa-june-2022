package miu.edu.phasei.service;

import miu.edu.phasei.entity.Course;
import miu.edu.phasei.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student findOne(int id);
    Student create(Student student);
    Student update(Student student, int id);
    void delete(int id);
    List<Student> getStudentsByMajor(String major);
    List<Course> getCoursesByStudentId(int id);
}
