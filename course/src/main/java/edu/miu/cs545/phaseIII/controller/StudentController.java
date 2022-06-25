package edu.miu.cs545.phaseIII.controller;

import edu.miu.cs545.phaseIII.dto.StudentDto;
import edu.miu.cs545.phaseIII.entity.Course;
import edu.miu.cs545.phaseIII.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService=studentService;
    }

    //Create
    @PostMapping
    public StudentDto addStudent(@RequestBody StudentDto studentDto){
        return studentService.createNewStudent(studentDto);
    }

    //Read
    @GetMapping
    public List<StudentDto> findAllStudents(){
        return studentService.getAllStudents();
    }

    //Update
    @PutMapping("/{id}")
    public StudentDto updateStudent(@RequestBody StudentDto studentDto, @PathVariable int id){
        return studentService.updateStudent(studentDto, id);
    }

    //Delete
    @DeleteMapping("/{id}")
    public StudentDto deleteStudent(@PathVariable int id){
        return studentService.deleteStudent(id);
    }

    //Find By Major
    @GetMapping("/major/{major}")
    public List<StudentDto> getStudentsByMajor(@PathVariable String major){
        return studentService.getStudentsByMajor(major);
    }

    //Find Courses By Student Id
    @GetMapping("/getCoursesByStudentId/{id}")
    public List<Course> getCoursesByStudentId(@PathVariable int id){
        return studentService.getCoursesByStudentId(id);
    }
}
