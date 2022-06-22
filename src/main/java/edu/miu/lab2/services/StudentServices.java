package edu.miu.lab2.services;

import edu.miu.lab2.entity.Student;

import java.util.List;

public interface StudentServices {

    List<Student> getStudents();

    void addStudent(Student student);

    void updateStudent(Student student, int id);

    void deleteStudent(int id);
}
