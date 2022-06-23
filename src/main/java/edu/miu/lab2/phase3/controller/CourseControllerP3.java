package edu.miu.lab2.phase3.controller;

import edu.miu.lab2.phase3.dto.CourseDtoP3;
import edu.miu.lab2.phase3.service.courseservice.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/phase3/courses")
@CrossOrigin

public class CourseControllerP3 {
    CourseService courseService;
    @GetMapping
    public List<CourseDtoP3> getCourse(){
        return courseService.getCourseDto();
    }

    @PostMapping
    public void addCourse(@RequestBody CourseDtoP3 c){
        courseService.createCourse(c);
    }

    @DeleteMapping
    public void deleteCourse(int id){
        courseService.deleteCourse(id);
    }

    @PutMapping("/{id}")
    public void updateCourse(@RequestBody CourseDtoP3 c, @PathVariable int id){
        courseService.updateCourse(c,id);
    }

}
