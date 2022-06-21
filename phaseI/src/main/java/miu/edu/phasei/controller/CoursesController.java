package miu.edu.phasei.controller;

import miu.edu.phasei.entity.Course;
import miu.edu.phasei.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CoursesController {
    private CourseService courseService;

    public CoursesController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public ResponseEntity<List<Course>> getAllCourse() {
        var courses = courseService.findAll();
        return  ResponseEntity.ok(courses);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Course> findOne(@PathVariable int id) {
        var course = courseService.findOne(id);
        return ResponseEntity.ok(course);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Course> update(@RequestBody Course course, @PathVariable int id) {
        var updatedCourse = courseService.update(course, id);
        return  ResponseEntity.ok(updatedCourse);
    }

    @PostMapping
    public ResponseEntity<Course> create(@RequestBody Course course) {
        course = courseService.create(course);
        return ResponseEntity.ok(course);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id){
        courseService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
