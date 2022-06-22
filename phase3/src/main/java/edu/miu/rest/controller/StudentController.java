package edu.miu.rest.controller;


import edu.miu.rest.entity.Student;
import edu.miu.rest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import edu.miu.rest.dto.StudentDto;
import edu.miu.rest.entity.Course;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    @CrossOrigin("*")
    public List<StudentDto> getAll(){
        return studentService.findAll();
    }

    @PostMapping("/students")
    @CrossOrigin("*")
    public void addStudent(@RequestBody StudentDto studentDto){
        studentService.addStudent(studentDto);
    }

    @GetMapping("/students/{id}/courses")
    public List<Course> getCourseByStudentId(@PathVariable int id){
        return studentService.findCoursesByStudentId(id);
    }

    @GetMapping("/students/{major}")
    public List<StudentDto> getStudentByMajor(@PathVariable String major){
        return studentService.findByMajor(major);
    }

    @PutMapping("/students")
    @CrossOrigin("*")
    public Student updateStudent(@RequestBody StudentDto studentDto){
        return studentService.updateStudent(studentDto);
    }

    @DeleteMapping("/students/{id}")
    @CrossOrigin("*")
    public String deleteStudent(@PathVariable int id){
        studentService.deleteStudentById(id);
        return "Student with " + id + " is deleted";
    }


}
