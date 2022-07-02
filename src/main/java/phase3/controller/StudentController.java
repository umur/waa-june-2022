package phase3.controller;

import com.waa.lab.one.phase.three.dto.CourseDTO;
import com.waa.lab.one.phase.three.dto.StudentDTO;
import com.waa.lab.one.phase.three.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

    public final StudentService studentService;

    @PostMapping
    public Long create(@RequestBody StudentDTO student) {
        return studentService.create(student);
    }

    @GetMapping("/student-by-major")
    public List<StudentDTO> getStudentByMajor(@RequestParam(value = "major", required = false) String major) {
        return studentService.getStudentsByMajor(major);
    }

    @GetMapping("/get-courses-by-student-id")
    public List<CourseDTO> getCoursesByStudentId(@RequestParam Long id) {
        return studentService.getCoursesByStudentId(id);
    }

}
