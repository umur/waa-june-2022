package com.phase3.demo.controller;


import com.phase3.demo.dto.CourseDto;
import com.phase3.demo.entity.Course;
import com.phase3.demo.service.CourseImpl;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
  @Autowired
  private CourseImpl courseService;
  @Autowired
  private ModelMapper modelMapper;

  @GetMapping
  public List<CourseDto> findAllCourse() {

    return courseService.findAll();
  }

  @PostMapping
  public void create(@RequestBody CourseDto dto) {
    courseService.create(dto);
  }

  @PutMapping("/{id}")
  public void update(@RequestBody CourseDto dto,
                     @PathVariable int id) {
    courseService.update(id, dto);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable int id) {
    courseService.delete(id);
  }
}
