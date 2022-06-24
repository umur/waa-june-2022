package miu.edu.restdto.lab1phase2.controller;


import miu.edu.restdto.lab1phase2.dto.CourseDto;
import miu.edu.restdto.lab1phase2.entity.Course;
import miu.edu.restdto.lab1phase2.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
    private CourseService courseService;

    @Autowired // optional
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    // http://localhost:8080/courses
    @GetMapping
    public List<CourseDto> findAll() {
        return courseService.findAll();
    }

    @PostMapping
    public void create(@RequestBody CourseDto course) {
        courseService.create(course);

    }

    @PutMapping("/{id}")
    public void update(@RequestBody CourseDto course,
                       @PathVariable int id) {
        courseService.update(id, course);

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        courseService.delete(id);
    }
}
