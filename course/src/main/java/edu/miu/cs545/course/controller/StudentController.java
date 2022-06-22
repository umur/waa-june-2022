package edu.miu.cs545.course.controller;

import edu.miu.cs545.course.entity.Student;
import edu.miu.cs545.course.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class StudentController {
    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService=studentService;
    }

    //Create
    @PostMapping
    public void addStudent(@RequestBody Student student){
        studentService.createNewStudent(student);
    }

    //Read
    @GetMapping
    public List<Student> findAllStudents(){
        return studentService.findAllStudent();
    }

    //Update
    @PutMapping("/{id}")
    public void updateStudent(@RequestBody Student student, @PathVariable int id){
        studentService.updateStudent(student, id);
    }

    //Delete
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
    }

}
