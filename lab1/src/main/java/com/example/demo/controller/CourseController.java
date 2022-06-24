package com.example.demo.controller;


import com.example.demo.entity.Course;
import com.example.demo.service.CourseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
  @Autowired
  private CourseImpl courseService;

  @GetMapping
  public List<Course> findAllProducts() {
    // http://localhost:8080/courses
    return courseService.findAll();
  }

  @PostMapping
  public void create(@RequestBody Course dto) {
    courseService.create(dto);
  }

  @PutMapping("/{id}")
  public void update(@RequestBody Course dto,
                     @PathVariable int id) {
    courseService.update(id, dto);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable int id) {
    courseService.delete(id);
  }
}
