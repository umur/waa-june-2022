package rest.cs545_waa_lab2_front.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rest.cs545_waa_lab2_front.dto.CourseDto;
import rest.cs545_waa_lab2_front.service.impl.CourseServiceImp;


import java.util.List;

@RestController
@RequestMapping("/courses")
@AllArgsConstructor
@CrossOrigin
public class CourseController {

    @Autowired
 private  final CourseServiceImp courseServiceImpl;


    @GetMapping(path = "{studentId}")
        public List<CourseDto> getCourseByStudentId(@PathVariable("studentId") int stdId){
        return courseServiceImpl.getCoursesByStudentId(stdId);
        }

@GetMapping()
        public List<CourseDto> getAllCourses(){

        return courseServiceImpl.getAllCourses();

        }
}
