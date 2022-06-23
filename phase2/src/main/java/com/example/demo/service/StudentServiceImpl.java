package com.example.demo.service;

import com.example.demo.dto.CourseDTO;
import com.example.demo.dto.StudentDTO;
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
  public List<StudentDTO> findAll() {

    List<Student> studentList = studentRepo.findAll();
    List<StudentDTO> dtos = new ArrayList<>();

    for (Student student : studentList
    ) {
      StudentDTO dto = new StudentDTO();
      StudentDTO dto1 = dto.toDto(student);
      dtos.add(dto1);
    }
    return dtos;
  }

  @Override
  public void create(StudentDTO dto) {
    Student student = dto.toEntity();
    studentRepo.create(student);
  }

  @Override
  public void delete(int id) {
    studentRepo.delete(id);
  }

  @Override
  public void update(int id, StudentDTO dto) {
    Student student = dto.toEntity();
    studentRepo.update(id, student);
  }

  @Override
  public List<StudentDTO> getStudentsByMajor(String major) {
    List<Student> studentList = studentRepo.getStudentsByMajor(major);
    var result = new ArrayList<StudentDTO>();
    for (Student student : studentList
    ) {
      StudentDTO studentDTO = new StudentDTO();
      StudentDTO studentDTO1 = studentDTO.toDto(student);
      result.add(studentDTO1);
    }

    return result;
  }

  @Override
  public List<CourseDTO> getCoursesByStudentId(int studentId) {
    var result = new ArrayList<CourseDTO>();
    List<Course> courseList = studentRepo.getCoursesByStudentId(studentId);
    for (Course course : courseList) {
      CourseDTO courseDTO = new CourseDTO();
      CourseDTO courseDTO1 = courseDTO.toDto(course);
      result.add(courseDTO1);
    }
    return result;
  }
}
