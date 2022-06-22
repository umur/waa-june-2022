package edu.miu.rest.controller;
import edu.miu.rest.entity.Course;
import edu.miu.rest.entity.Student;
import edu.miu.rest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAll(){
        return studentService.findAll();
    }

    @GetMapping("/students/{id}/courses")
    public List<Course> getCourseByStudentId(@PathVariable int id){
        return studentService.findCoursesByStudentId(id);
    }

    @GetMapping("/students/{major}")
    public List<Student> getStudentByMajor(@PathVariable String major){
        return studentService.findByMajor(major);
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student){
       return studentService.addStudents(student);
    }

    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable int id){
        studentService.deleteStudentById(id);
        return "Student with " + id + " is deleted";
    }
}
