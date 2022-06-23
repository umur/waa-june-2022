package rest.cs545_waa_lab2_dto.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rest.cs545_waa_lab2_dto.dto.CourseDto;
import rest.cs545_waa_lab2_dto.entity.Course;
import rest.cs545_waa_lab2_dto.service.impl.CourseServiceImp;

import java.util.List;

@RestController
@RequestMapping("/courses")
@AllArgsConstructor
public class CourseController {

    @Autowired
 private  final CourseServiceImp courseServiceImpl;


    @GetMapping(path = "{studentId}")
        public List<CourseDto> getCourseByStudentId(@PathVariable("studentId") int stdId){
        return courseServiceImpl.getCoursesByStudentId(stdId);
        }

@GetMapping("/listCourse")
        public List<CourseDto> getAllCourses(){

        return courseServiceImpl.getAllCourses();

        }
}
