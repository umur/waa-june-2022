package edu.miu.lab2.controller;

import edu.miu.lab2.entity.Course;
import edu.miu.lab2.entity.Student;
import edu.miu.lab2.services.StudentServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@AllArgsConstructor
public class StudentController {

    private final StudentServices studentServices;

    @GetMapping("/")
    public List<Student> getStudents() {
        return studentServices.getStudents();
    }

    @PostMapping("/")
    public void addStudent(@RequestBody Student student) {
        studentServices.addStudent(student);
    }

    @PutMapping("/{id}")
    public void updateStudent(@RequestBody Student student, @PathVariable int id) {
        studentServices.updateStudent(student, id);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Integer id) {
        studentServices.deleteStudent(id);
    }

    @GetMapping("/major/{major}")
    public Student getStudentsByMajor(@PathVariable String major) {
        return studentServices.getStudentsByMajor(major);
    }
    @GetMapping("/sid/{id}")
    public List<Course> getCoursesByStudentId(@PathVariable int id) {
        return studentServices.getCoursesByStudentId(id);
    }

}
