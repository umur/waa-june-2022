package phaseI.miu.cs545.course.controller;

import phaseI.miu.cs545.course.entity.Course;
import phaseI.miu.cs545.course.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
    private CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService){
        this.courseService=courseService;
    }

    //Create
    @PostMapping
    public void addCourse(@RequestBody Course course){
        courseService.createNewCourse(course);
    }

    //Read
    @GetMapping
    public List<Course> findAllCourses(){
        return courseService.findAllCourses();
    }

    //Update
    @PutMapping("/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable int id){
        courseService.updateCourse(course, id);
    }

    //Delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        courseService.deleteCourse(id);
    }
}
