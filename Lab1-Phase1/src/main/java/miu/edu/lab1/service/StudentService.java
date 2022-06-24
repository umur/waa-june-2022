package miu.edu.lab1.service;

import miu.edu.lab1.entity.Course;
import miu.edu.lab1.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> findAll();

    public void create(Student student);

    public void delete(int id);

    public void update(int id, Student s);

    public List<Student> getStudentsByMajor(String major);

    public List<Course> getCoursesByStudentId(int id);
}
