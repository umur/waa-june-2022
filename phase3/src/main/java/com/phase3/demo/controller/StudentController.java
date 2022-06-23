package com.phase3.demo.controller;

import com.phase3.demo.dto.CourseDto;
import com.phase3.demo.dto.StudentDto;
import com.phase3.demo.entity.Student;
import com.phase3.demo.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
  @Autowired
  private StudentServiceImpl studentService;

  @GetMapping
  public List<StudentDto> findAllStudents() {
    return studentService.findAll();
  }

  @PostMapping
  public void create(@RequestBody StudentDto dto) {
    studentService.create(dto);

  }

  @PutMapping("/{id}")
  public void update(@RequestBody StudentDto dto, @PathVariable int id) {
    studentService.update(id, dto);
  }

  @DeleteMapping("/id")
  public void delete(@PathVariable int id) {
    studentService.delete(id);

  }

  @GetMapping("/{id}")
  public List<CourseDto> getCoursesByStudentId(@PathVariable int studentId) {
    return studentService.getCoursesByStudentId(studentId);
  }

  @GetMapping("/{major}")
  public List<StudentDto> getStudentsByMajor(@PathVariable String major) {
    return studentService.getStudentsByMajor(major);
  }
}
