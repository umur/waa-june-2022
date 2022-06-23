package rest.cs545_waa_lab2_front.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import rest.cs545_waa_lab2_front.dto.StudentDto;
import rest.cs545_waa_lab2_front.entity.Student;
import rest.cs545_waa_lab2_front.service.impl.StudentServiceImp;


import java.util.List;


@RestController
@RequestMapping("/students")
@AllArgsConstructor
@CrossOrigin
public class StudentController {


    private final StudentServiceImp studentServiceImp;

    @GetMapping(path = "/{byMajor}")
    public List<StudentDto> getListStudentsByMajor(@PathVariable("byMajor") String major){
        return studentServiceImp.getStudentByMajor(major);

    }

}
