package edu.mui.rest.PhaseII.controller;

import edu.mui.rest.PhaseII.entity.Student;
import edu.mui.rest.PhaseII.dto.StudentDto;
import edu.mui.rest.PhaseII.entity.Course;
import edu.mui.rest.PhaseII.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;


    @GetMapping("/students/id/{id}")
    public List<Course> getCourseByStudentId(@PathVariable int id){
        return studentService.findCoursesByStudentId(id);
    }

    @GetMapping("/students/{major}")
    public List<StudentDto> getStudentByMajor(@PathVariable String major){
        return studentService.findByMajor(major);
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody StudentDto studentDto){
       return studentService.addStudents(studentDto);
    }

    @PutMapping("/students")
    public Student updateStudent(@RequestBody StudentDto studentDto){
        return studentService.updateStudent(studentDto);
    }

    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable int id){
        studentService.deleteStudentById(id);
        return "Deleted";
    }





}
