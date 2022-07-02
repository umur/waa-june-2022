package phase1.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import phase1.entity.Course;
import phase1.entity.Student;
import phase1.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

    public final StudentService studentService;

    @PostMapping
    public Integer create(@RequestBody Student student) {
        return studentService.create(student);
    }

    @GetMapping("/student-by-major")
    public List<Student> getStudentByMajor(@RequestParam String major) {
        return studentService.getStudentsByMajor(major);
    }

    @GetMapping("/get-courses-by-student")
    public List<Course> getCoursesByStudentId(@RequestParam Integer id) {
        return studentService.getCoursesByStudentId(id);
    }

}
