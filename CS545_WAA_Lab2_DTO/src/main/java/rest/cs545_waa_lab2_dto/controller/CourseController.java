package rest.cs545_waa_lab2.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rest.cs545_waa_lab2.entity.Course;
import rest.cs545_waa_lab2.service.CourseService;
import rest.cs545_waa_lab2.service.impl.CourseServiceImp;

import java.util.List;

@RestController
@RequestMapping("/courses")
@AllArgsConstructor
public class CourseController {

    @Autowired
 private  final CourseServiceImp courseServiceImpl;


    @GetMapping(path = "{studentId}")
        public List<Course> getCourseByStudentId(@PathVariable("studentId") int stdId){
        return courseServiceImpl.getCoursesByStudentId(stdId);
        }


}
