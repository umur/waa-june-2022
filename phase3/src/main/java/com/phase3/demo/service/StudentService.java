package com.phase3.demo.service;


import com.phase3.demo.dto.CourseDto;
import com.phase3.demo.dto.StudentDto;
import com.phase3.demo.entity.Course;
import com.phase3.demo.entity.Student;

import java.util.List;

public interface StudentService {
  public List<StudentDto> findAll();
  public void create(StudentDto dto);
  public void delete(int id);
  public  void update (int id, StudentDto dto);
  public List<StudentDto> getStudentsByMajor(String major);
  public List<CourseDto> getCoursesByStudentId(int studentId);

}
