package edu.miu.lab2.services;

import edu.miu.lab2.entity.Course;
import edu.miu.lab2.entity.Student;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface StudentServices {

    List<Student> getStudents();

    void addStudent(Student student);

    void updateStudent(Student student, int id);

    void deleteStudent(int id);

    Student getStudentsByMajor(String major);

    List<Course> getCoursesByStudentId(int sid);
}
