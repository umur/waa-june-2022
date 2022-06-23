package edu.miu.lab2.phase2.controller;

import edu.miu.lab2.phase2.dto.CourseDto;
import edu.miu.lab2.phase2.entity.Course;
import edu.miu.lab2.phase2.service.courseservice.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/phase2/courses")
public class CourseControllerP2 {
    CourseService courseService;
    @GetMapping
    public List<CourseDto> getCourse(){
        return courseService.getCourseDto();
    }

    @PostMapping
    public void addCourse(@RequestBody CourseDto c){
        courseService.createCourse(c);
    }

    @DeleteMapping
    public void deleteCourse(int id){
        courseService.deleteCourse(id);
    }

    @PutMapping("/{id}")
    public void updateCourse(@RequestBody CourseDto c, @PathVariable int id){
        courseService.updateCourse(c,id);
    }

}
