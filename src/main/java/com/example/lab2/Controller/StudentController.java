package com.example.lab2.Controller;

import com.example.lab2.Entity.Course;
import com.example.lab2.Entity.Student;
import com.example.lab2.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/students")
    public List<Student> findAll(){
        return studentService.findAll();

    }
    @GetMapping("/{id}")
    private Student findById(@PathVariable int id){
        return studentService.getById(id);
    }
    @PostMapping("/courses")
    public void add(@RequestBody Student s){
        studentService.add(s);

    }
    @PutMapping("/{id}")
    public boolean update(@PathVariable int id,@RequestBody Student s){
        return studentService.update(id,s);
    }
    @DeleteMapping("/student")
    public String deleteAll(){
       return studentService.deleteAll();
    }
    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable int id){
        return studentService.deleteById(id);

    }
    @GetMapping("/{major}")
    public List<Student> getStudentByMajor(@PathVariable String major){
        return studentService.getStudentByMajor(major);
    }
    @GetMapping("/{studentId}")
    public List<Course> getCoursesByStudentId(@PathVariable int studentId){
        return studentService.getCourseByStudentId(studentId);
    }
}
