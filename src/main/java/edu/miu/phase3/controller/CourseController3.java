package edu.miu.phase3.controller;

import edu.miu.phase3.dto.CourseDto;
import edu.miu.phase3.services.CourseServices3;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/phase3/courses")
@AllArgsConstructor
@CrossOrigin
public class CourseController3 {
    private final CourseServices3 courseService;

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
