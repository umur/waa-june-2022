package com.waa.assignment.controller;

import com.waa.assignment.entity.Course;
import com.waa.assignment.entity.Student;
import com.waa.assignment.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping()
    public List<Student> getAll() {
        return studentService.findAll();
    }

    @GetMapping("/majors/{major}")
    public List<Student> getByMajor(@PathVariable String major) {
        return studentService.getByMajor(major);
    }

    @GetMapping("/courses/{id}")
    public List<Course> getByMajor(@PathVariable int id) {
        return studentService.getCoursesByStudentId(id);
    }

    @PostMapping()
    public String save(@RequestBody Student stu) {
        studentService.save(stu);
        return "Saved";
    }

    @PutMapping("/{id}")
    public String update(@PathVariable int id, @RequestBody Student stu) {
        stu.setId(id);
        studentService.update(stu);
        return "Updated";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        studentService.delete(id);
        return "Deleted";
    }
}
