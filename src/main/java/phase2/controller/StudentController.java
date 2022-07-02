package phase2.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import phase2.dto.CourseDTO;
import phase2.dto.StudentDTO;
import phase2.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

    public final StudentService studentService;

    @PostMapping
    public Integer create(@RequestBody StudentDTO student) {
        return studentService.create(student);
    }

    @GetMapping("/student-by-major")
    public List<StudentDTO> getStudentByMajor(@RequestParam String major) {
        return studentService.getStudentsByMajor(major);
    }

    @GetMapping("/get-courses-by-studentid")
    public List<CourseDTO> getCoursesByStudentId(@RequestParam Integer id) {
        return studentService.getCoursesByStudentId(id);
    }

}
