package edu.miu.cs545.course.controller;

import edu.miu.cs545.course.entity.Course;
import edu.miu.cs545.course.service.CourseService;
import edu.miu.cs545.course.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
    private CourseService courseService;
    private StudentService studentService;

    @Autowired
    public CourseController(CourseService courseService, StudentService studentService){
        this.courseService=courseService;
        this.studentService=studentService;
    }

    @GetMapping
    public List<Course> findAllCourses{
        return courseService.
    }

    @PostMapping
    public void addCourse{
        return courseService.createNewCourse(@RequestBody Course course);
    }
}
