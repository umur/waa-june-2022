package com.lab.phase3.controller;

import com.lab.phase3.dto.CourseDto;
import com.lab.phase3.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public List<CourseDto> findAllProducts() {
        return courseService.findAll();
    }

    @PostMapping
    public void create(@RequestBody CourseDto dto) {
        courseService.create(dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        courseService.delete(id);
    }

    @PutMapping("/{id}")
    public CourseDto update(@RequestBody CourseDto courseDto, @PathVariable int id) {
        return courseService.update(courseDto, id);
    }
}
