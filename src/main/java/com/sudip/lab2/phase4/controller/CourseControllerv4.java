package com.sudip.lab2.phase4.controller;

import com.sudip.lab2.phase4.dto.CourseDTOv4;
import com.sudip.lab2.phase4.services.CourseServicev4;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v4/courses")
@AllArgsConstructor
@CrossOrigin
public class CourseControllerv4 {
    private final CourseServicev4 courseService;

    @GetMapping
    public List<CourseDTOv4> findAll() {
        return courseService.findAll();
    }

    @PostMapping("/create")
    public void create(@RequestBody CourseDTOv4 courseDTO) {
        courseService.create(courseDTO);
    }

    @PutMapping("/update/{id}")
    public void update(@RequestBody CourseDTOv4 courseDTO, @PathVariable int id) {
        courseService.update(courseDTO, id);
    }

    @DeleteMapping("/remove/{id}")
    public void remove(@PathVariable int id) {
        courseService.remove(id);
    }

}
