package edu.miu.phase3.controller;

import edu.miu.phase3.dto.CourseDto;
import edu.miu.phase3.dto.StudentDTO;
import edu.miu.phase3.services.StudentServices3;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/phase3/students")
@AllArgsConstructor
@CrossOrigin
public class StudentController3 {

    private final StudentServices3 studentServices;

    @GetMapping("/")
    public List<StudentDTO> getStudents() {
        return studentServices.getStudents();
    }

    @PostMapping("/")
    public void addStudent(@RequestBody StudentDTO student) {
        studentServices.addStudent(student);
    }

    @PutMapping("/{id}")
    public void updateStudent(@RequestBody StudentDTO student, @PathVariable int id) {
        studentServices.updateStudent(student, id);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Integer id) {
        studentServices.deleteStudent(id);
    }

    @GetMapping("/major/{major}")
    public StudentDTO getStudentsByMajor(@PathVariable String major) {
        return studentServices.getStudentsByMajor(major);
    }
    @GetMapping("/sid/{id}")
    public List<CourseDto> getCoursesByStudentId(@PathVariable int id) {
        return studentServices.getCoursesByStudentId(id);
    }

}
