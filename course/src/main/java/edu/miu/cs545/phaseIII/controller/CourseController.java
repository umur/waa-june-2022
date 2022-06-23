package edu.miu.cs545.phaseIII.controller;

import edu.miu.cs545.phaseIII.dto.CourseDto;
import edu.miu.cs545.phaseIII.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
    private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService){
        this.courseService=courseService;
    }

    //Create
    @PostMapping
    public CourseDto addCourse(@RequestBody CourseDto courseDto){
        return courseService.createNewCourse(courseDto);
    }

    //Read
    @GetMapping
    public List<CourseDto> findAllCourses(){
        return courseService.findAllCourses();
    }

    //Update
    @PutMapping("/{id}")
    public CourseDto updateCourse(@RequestBody CourseDto courseDto, @PathVariable int id){
        return courseService.updateCourse(courseDto, id);
    }

    //Delete
    // return deleted value
    @DeleteMapping("/{id}")
    public CourseDto deleteCourse(@PathVariable int id){
        return courseService.deleteCourse(id);
    }
}
