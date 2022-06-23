package com.example.demowaa.controller;

import com.example.demowaa.Dto.CourseDto;
import com.example.demowaa.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
    private CourseService courseService;

    @GetMapping
    public List<CourseDto> FindAllProduct(){

        return courseService.findAll();
    }
    @PostMapping
    public void create(@RequestBody CourseDto courseDto){
        courseService.create(courseDto);


    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        courseService.delete(id);
        return "deleted";
    }
    @PutMapping("/{id}")
    public boolean update(@RequestBody CourseDto c,@PathVariable int id){
        return courseService.update(c,id);
    }

}
