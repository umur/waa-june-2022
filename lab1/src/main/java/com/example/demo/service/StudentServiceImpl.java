package com.example.demo.service;


import com.example.demo.entity.Course;
import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
  @Autowired
  StudentRepo studentRepo;

  @Override
  public List<Student> findAll() {

   return studentRepo.findAll();

  }

  @Override
  public void create(Student dto) {
    studentRepo.create(dto);
  }

  @Override
  public void delete(int id) {
    studentRepo.delete(id);
  }

  @Override
  public void update(int id, Student dto) {
    studentRepo.update(id, dto);
  }

  @Override
  public List<Student> getStudentsByMajor(String major) {
   return studentRepo.getStudentsByMajor(major);

  }

  @Override
  public List<Course> getCoursesByStudentId(int studentId) {
  return studentRepo.getCoursesByStudentId(studentId);

  }
}
