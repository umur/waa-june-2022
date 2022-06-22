package edu.mui.rest.PhaseI.controller;
import edu.mui.rest.PhaseI.entity.Course;
import edu.mui.rest.PhaseI.entity.Student;
import edu.mui.rest.PhaseI.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;



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
    public Student updateStudent(@RequestBody Student studentDto){
        return studentService.updateStudent(studentDto);
    }

    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable int id){
        studentService.deleteStudentById(id);
        return "Deleted";
    }
}
