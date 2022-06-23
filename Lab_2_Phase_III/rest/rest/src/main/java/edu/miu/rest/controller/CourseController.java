package edu.miu.rest.controller;

import edu.miu.rest.dto.CourseDto;
import edu.miu.rest.entity.Course;
import edu.miu.rest.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/courses")
@CrossOrigin
public class CourseController {
    private final CourseService courseService;

//    @Autowired // optional
//    public CourseController(CourseService courseService){
//        this.courseService=courseService;
//    }

    // http://localhost:8080/courses
    @GetMapping
    public List<CourseDto> findAllCourses() {
        return courseService.findAll();
    }

    // http://localhost:8080/courses?age=20

//    @GetMapping("/search")
//    public List<Course> getAllStudentsByAge(@RequestParam int age){
//
//        return nulll;
//    }

    @PostMapping
    public void create(@RequestBody CourseDto c){
        courseService.create(c);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody CourseDto c,
                       @PathVariable int id){

        List<CourseDto> courses = courseService.findAll();
        for(CourseDto course: courses)
        {
            if(course.getId() == id)
            {   courseService.update(c);}
        }

    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){

        List<CourseDto> courses = courseService.findAll();
        for(CourseDto c: courses)
        {
            if(c.getId() == id)
            {   courseService.delete(c);}
        }

    }
}
