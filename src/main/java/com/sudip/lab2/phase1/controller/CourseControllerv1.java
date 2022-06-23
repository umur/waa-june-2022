package com.sudip.lab2.phase1.controller;

import com.sudip.lab2.phase1.entity.Course;
import com.sudip.lab2.phase1.services.CourseServicev1;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/courses")
@AllArgsConstructor
@CrossOrigin
public class CourseControllerv1 {
    private final CourseServicev1 courseService;

    @GetMapping
    public List<Course> findAll() {
        return courseService.findAll();
    }

    @PostMapping("/create")
    public void create(@RequestBody Course course) {
        courseService.create(course);
    }

    @PutMapping("/update/{id}")
    public void update(@RequestBody Course course, @PathVariable int id) {
        courseService.update(course, id);
    }

    @DeleteMapping("/remove/{id}")
    public void remove(@PathVariable int id) {
        courseService.remove(id);
    }

}
