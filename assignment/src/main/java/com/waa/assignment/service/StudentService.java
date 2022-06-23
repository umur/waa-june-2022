package com.waa.assignment.service;

import com.waa.assignment.entity.Course;
import com.waa.assignment.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    List<Student> findAll();
    List<Student> getByMajor(String major);
    public List<Course> getCoursesByStudentId(int studentId);
    public void save(Student stu);
    public void update(Student stu);
    public void delete(int id);

}
