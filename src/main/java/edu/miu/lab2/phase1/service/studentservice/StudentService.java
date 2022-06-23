package edu.miu.lab2.phase1.service.studentservice;

import edu.miu.lab2.phase1.entity.Student;

import java.util.List;

public interface StudentService {

    public List<Student> getStudent();

    public void deleteStudent(int id);
    public void createStudent(Student student);

    public void updateStudent(Student s, int id);

}
