package com.sudip.lab2.phase2.controller;

import com.sudip.lab2.phase3.dto.CourseDTO;
import com.sudip.lab2.phase3.services.CourseServicev3;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v2/courses")
@AllArgsConstructor
@CrossOrigin
public class CourseControllerv2 {
    private final CourseServicev3 courseService;

    @GetMapping
    public List<CourseDTO> findAll() {
        return courseService.findAll();
    }

    @PostMapping("/create")
    public void create(@RequestBody CourseDTO courseDTO) {
        courseService.create(courseDTO);
    }

    @PutMapping("/update/{id}")
    public void update(@RequestBody CourseDTO courseDTO, @PathVariable int id) {
        courseService.update(courseDTO, id);
    }

    @DeleteMapping("/remove/{id}")
    public void remove(@PathVariable int id) {
        courseService.remove(id);
    }

}
