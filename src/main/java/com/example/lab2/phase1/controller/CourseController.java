package com.example.lab2.phase1.controller;

import com.example.lab2.phase1.entity.Course;
import com.example.lab2.phase1.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("course")
public class CourseController {
    private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService){
        this.courseService = courseService;
    }

    @GetMapping("/")
    public List<Course> findAllCourses(){
        return courseService.findAll();
    }

    @GetMapping("/search")
    public List<Course> getCoursesByStudentId(@RequestParam int id){
        return courseService.getCoursesByStudentId(id);
    }
}
