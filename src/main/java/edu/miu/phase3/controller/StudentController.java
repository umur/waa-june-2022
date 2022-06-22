package edu.miu.phase3.controller;

import edu.miu.phase3.dto.StudentDto;
import edu.miu.phase3.entity.Course;
import edu.miu.phase3.entity.Student;
import edu.miu.phase3.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @CrossOrigin(origins = "*")
    @GetMapping("/students")
    public List<Student> findAllStudents(){
        return studentService.findAllStudents();
    }

    @PostMapping("/student")
    public Student createStudent(@RequestBody StudentDto studentDto){
        return studentService.createStudent(studentDto);
    }

    @DeleteMapping("/student/{id}")
    public Student deleteStudent(@PathVariable int id) throws Exception {
        return studentService.removeStudentById(id);
    }

    @PutMapping("/student")
    public Student updateStudent(@RequestBody StudentDto studentDto) throws Exception {
        return studentService.updateStudent(studentDto);
    }

    @GetMapping("/students/{id}")
    public Student findStudentById(@PathVariable int id){
        return studentService.findStudentById(id);
    }

    @GetMapping("/students/major/{major}")
    public List<Student> getStudentsByMajor(@PathVariable String major){
        return studentService.getStudentsByMajor(major);
    }

    @GetMapping("/student/courses/{id}")
    public List<Course> getCoursesByStudentId(@PathVariable int id){
        return studentService.getCoursesByStudentId(id);
    }

}
