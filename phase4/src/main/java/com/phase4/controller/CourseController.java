package com.phase4.controller;

import com.phase4.dto.CourseDto;
import com.phase4.service.impl.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/courses")
public class CourseController {
    private final CourseService courseService;

    @GetMapping
    public List<CourseDto> getAll() {
        return courseService.getAll();
     }

    @GetMapping("/{id}")
    public CourseDto getById(@PathVariable Long id) {return courseService.getById(id);}

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        courseService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody CourseDto p, @PathVariable Long id) {
        courseService.update(id,p);
    }

    @PostMapping
    public void save(@RequestBody CourseDto p) { courseService.save(p); }

}