package edu.miu.rest.controller;

import edu.miu.rest.entity.Course;
import edu.miu.rest.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class CourseController {
    private final CourseService courseService;

//    @Autowired // optional
//    public CourseController(CourseService courseService){
//        this.courseService=courseService;
//    }

    // http://localhost:8080/courses
    @GetMapping
    public List<Course> findAllCourses() {
        return courseService.findAll();
    }

    // http://localhost:8080/courses?age=20

//    @GetMapping("/search")
//    public List<Course> getAllStudentsByAge(@RequestParam int age){
//
//        return nulll;
//    }

    @PostMapping
    public void create(@RequestBody Course c){
        courseService.create(c);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Course c,
                       @PathVariable int id){

        List<Course> courses = courseService.findAll();
        for(Course course: courses)
        {
            if(course.getId() == id)
            {   courseService.update(c);}
        }

    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){

        List<Course> courses = courseService.findAll();
        for(Course c: courses)
        {
            if(c.getId() == id)
            {   courseService.delete(c);}
        }

    }
}
