package com.example.demo.service;



import com.example.demo.dto.CourseDto;
import com.example.demo.dto.StudentDto;
import com.example.demo.entity.Course;
import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepo;
import com.example.demo.util.ListMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
  @Autowired
  StudentRepo studentRepo;
  @Autowired
  ListMapper<Student, StudentDto> listMapper;
  @Autowired
  ListMapper<Course, CourseDto> listMapper1;
  @Autowired
  ModelMapper modelMapper;

  @Override
  public List<StudentDto> findAll() {

    return (List<StudentDto>) listMapper.mapList(studentRepo.findAll(), new StudentDto());

  }

  @Override
  public void create(StudentDto dto) {
    Student student = modelMapper.map(dto, Student.class);
    studentRepo.create(student);
  }

  @Override
  public void delete(int id) {
    studentRepo.delete(id);
  }

  @Override
  public void update(int id, StudentDto dto) {
    Student student = modelMapper.map(dto, Student.class);
    studentRepo.update(id, student);
  }

  @Override
  public List<StudentDto> getStudentsByMajor(String major) {

    List<Student> studentList = studentRepo.getStudentsByMajor(major);
    return (List<StudentDto>) listMapper.mapList(studentList, new StudentDto());
  }

  @Override
  public List<CourseDto> getCoursesByStudentId(int studentId) {
    List<Course> courses = studentRepo.getCoursesByStudentId(studentId);
    return (List<CourseDto>) listMapper1.mapList(courses, new CourseDto());
  }
}
