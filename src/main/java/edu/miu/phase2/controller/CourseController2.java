package edu.miu.phase2.controller;

import edu.miu.phase2.dto.CourseDto;
import edu.miu.phase2.services.CourseServices2;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/phase2/courses")
@AllArgsConstructor
public class CourseController2 {
    private final CourseServices2 courseService;

    @GetMapping("/")
    public List<CourseDto> getCourses() {
        return courseService.getCourses();
    }

    @PostMapping("/")
    public void addCourse(@RequestBody CourseDto course) {
        courseService.addCourse(course);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody CourseDto course, @PathVariable int id) {
        courseService.updateCourse(course, id);
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable int id) {
        courseService.deleteCourse(id);
    }


}
