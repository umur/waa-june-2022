package com.example.rest.phaseIII.controller;

import com.example.rest.phaseIII.entity.Course;
import com.example.rest.phaseIII.repo.CourseRepo;
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
