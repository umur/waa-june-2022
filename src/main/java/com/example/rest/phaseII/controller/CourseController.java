package com.example.rest.phaseII.controller;

import com.example.rest.phaseII.entity.Course;
import com.example.rest.phaseII.repo.CourseRepo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class CourseController {

    // if private final no need to @autowire
    private final CourseRepo courseRepo;

    @GetMapping("/courses")
    public List<Course> findAllProducts() {
        courseRepo.findAll();
        return null;
    }


}
