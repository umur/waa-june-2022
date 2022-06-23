package edu.miu.lab2.phase1.controller;

import edu.miu.lab2.phase1.entity.Course;
import edu.miu.lab2.phase1.service.courseservice.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/courses")
public class CourseController {
    CourseService courseService;
    @GetMapping
    public List<Course> getCourse(){
        return courseService.getCourse();
    }

    @PostMapping
    public void addCourse(@RequestBody Course c){
        courseService.createCourse(c);
    }

    @DeleteMapping
    public void deleteCourse(int id){
        courseService.deleteCourse(id);
    }

    @PutMapping("/{id}")
    public void updateCourse(@RequestBody Course c, @PathVariable int id){
        courseService.updateCourse(c,id);
    }

}
