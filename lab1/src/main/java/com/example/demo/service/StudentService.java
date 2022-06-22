package com.example.demo.service;

import com.example.demo.dto.CourseDTO;
import com.example.demo.dto.StudentDTO;
import com.example.demo.entity.Course;
import com.example.demo.entity.Student;

import java.util.List;

public interface StudentService {
  public List<StudentDTO> findAll();
  public void create(StudentDTO dto);
  public void delete(int id);
  public  void update (int id, StudentDTO dto);
  List<StudentDTO> getStudentsByMajor(String major);
  public List<CourseDTO> getCoursesByStudentId(int studentId);

}
