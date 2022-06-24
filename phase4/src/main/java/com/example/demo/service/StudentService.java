package com.example.demo.service;


import com.example.demo.dto.CourseDto;
import com.example.demo.dto.StudentDto;


import java.util.List;

public interface StudentService {
  public List<StudentDto> findAll();
  public void create(StudentDto dto);
  public void delete(int id);
  public  void update (int id, StudentDto dto);
  public List<StudentDto> getStudentsByMajor(String major);
  public List<CourseDto> getCoursesByStudentId(int studentId);

}
