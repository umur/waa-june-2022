package edu.miu.lab2.controller;

import edu.miu.lab2.entity.Course;
import edu.miu.lab2.services.CourseServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
@AllArgsConstructor
public class CourseController {
    private final CourseServices courseService;

    @GetMapping("/")
    public List<Course> getCourses() {
        return courseService.getCourses();
    }

    @PostMapping("/")
    public void addCourse(@RequestBody Course course) {
        courseService.addCourse(course);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Course course, @PathVariable int id) {
        courseService.updateCourse(course, id);
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable int id) {
        courseService.deleteCourse(id);
    }
}
