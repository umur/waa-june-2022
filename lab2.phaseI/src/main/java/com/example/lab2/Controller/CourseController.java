package com.example.lab2.Controller;

import com.example.lab2.Entity.Course;
import com.example.lab2.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;
    @GetMapping("/courses")
    public List<Course> findAll(){
        return courseService.findAll();

    }
    @GetMapping("/{id}")
    public Course findByid(@PathVariable int id){
        return courseService.findById(id);
    }
    @PostMapping("/course")
    public void add(@RequestBody Course c){
        courseService.add(c);
    }
    @DeleteMapping("/courses")
    public String deleteAll(){
        return courseService.deleteAll();
    }
    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable int id){
        return courseService.deleteById(id);
    }
    @PutMapping("/{id}")
    public boolean update(@PathVariable int id,@RequestBody Course c){
        return courseService.update(id,c);
    }

}
