package rest.service;

import rest.entity.Student;
import rest.entity.course;

import java.util.List;

public interface studentService {
    void delete(int id);
    void save(Student s);
    List<Student> getAll();
    Student getById(int id);
    List<course> getCourseByStudent(int id);

}
