package com.example.demo.service;


import com.example.demo.entity.Course;
import com.example.demo.entity.Student;

import java.util.List;

public interface StudentService {
  public List<Student> findAll();
  public void create(Student dto);
  public void delete(int id);
  public  void update (int id, Student dto);
  public List<Student> getStudentsByMajor(String major);
  public List<Course> getCoursesByStudentId(int studentId);

}
