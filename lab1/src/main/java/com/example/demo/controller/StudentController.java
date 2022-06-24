package com.example.demo.controller;


import com.example.demo.entity.Course;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
  @Autowired
  private StudentServiceImpl studentService;

  @GetMapping
  public List<Student> findAllStudents() {
    return studentService.findAll();
  }

  @PostMapping
  public void create(@RequestBody Student dto) {
    studentService.create(dto);

  }

  @PutMapping("/{id}")
  public void update(@RequestBody Student dto, @PathVariable int id) {
    studentService.update(id, dto);
  }

  @DeleteMapping("/id")
  public void delete(@PathVariable int id) {
    studentService.delete(id);

  }

  @GetMapping("/{id}")
  public List<Course> getCoursesByStudentId(@PathVariable int studentId) {
    return studentService.getCoursesByStudentId(studentId);
  }

  @GetMapping("/{major}")
  public List<Student> getStudentsByMajor(@PathVariable String major) {
    return studentService.getStudentsByMajor(major);
  }
}
