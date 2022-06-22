package com.example.demo.controller;

import com.example.demo.dto.CourseDTO;
import com.example.demo.dto.StudentDTO;
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
  public List<StudentDTO> findAllStudents() {
    return studentService.findAll();
  }

  @PostMapping
  public void create(@RequestBody StudentDTO dto) {
    studentService.create(dto);

  }

  @PutMapping("/{id}")
  public void update(@RequestBody StudentDTO dto, @PathVariable int id) {
    studentService.update(id, dto);
  }

  @DeleteMapping("/id")
  public void delete(@PathVariable int id) {
    studentService.delete(id);

  }

  @GetMapping("/{id}")
  public List<CourseDTO> getCoursesByStudentId(@PathVariable int studentId) {
    return studentService.getCoursesByStudentId(studentId);
  }

  @GetMapping("/{major}")
  public List<StudentDTO> getStudentsByMajor(@PathVariable String major) {
    return studentService.getStudentsByMajor(major);
  }
}
