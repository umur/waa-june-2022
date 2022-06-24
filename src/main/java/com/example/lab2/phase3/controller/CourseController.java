package com.example.lab2.phase3.controller;


import com.example.lab2.phase3.DTO.CourseDTO;
import com.example.lab2.phase3.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/all")
    public List<CourseDTO> findAllCourses() {
        return courseService.findAll();
    }

    @PostMapping("/create")
    public void createCourse(@RequestBody CourseDTO courseDTO){
        courseService.createCourse(courseDTO);
    }

    @GetMapping("/delete")
    public void deleteCourse(@RequestParam int id){
        courseService.deleteCourse(id);
    }

    @GetMapping("/search")
    public List<CourseDTO> getCoursesByStudentId(@RequestParam int id) {
        return courseService.getCoursesByStudentId(id);
    }

}
