package miu.edu.phase3.controller;

import miu.edu.phase3.dto.CourseDto;
import miu.edu.phase3.service.CourseService;
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
    public ResponseEntity<List<CourseDto>> getAllCourse() {
        var courses = courseService.findAll();
        return  ResponseEntity.ok(courses);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CourseDto> findOne(@PathVariable int id) {
        var course = courseService.findOne(id);
        return ResponseEntity.ok(course);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CourseDto> update(@RequestBody CourseDto course, @PathVariable int id) {
        var updatedCourse = courseService.update(course, id);
        return  ResponseEntity.ok(updatedCourse);
    }

    @PostMapping
    public ResponseEntity<CourseDto> create(@RequestBody CourseDto course) {
        course = courseService.create(course);
        return ResponseEntity.ok(course);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id){
        courseService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
