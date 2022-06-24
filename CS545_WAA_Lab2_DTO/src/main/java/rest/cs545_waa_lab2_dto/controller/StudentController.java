package rest.cs545_waa_lab2_dto.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rest.cs545_waa_lab2_dto.entity.Student;
import rest.cs545_waa_lab2_dto.service.impl.StudentServiceImp;

import java.util.List;


@RestController
@RequestMapping("/students")
@AllArgsConstructor
public class StudentController {


    private final StudentServiceImp studentServiceImp;

    @GetMapping(path = "/{byMajor}")
    public List<Student> getListStudentsByMajor(@PathVariable("byMajor") String major){
        return studentServiceImp.getStudentByMajor(major);

    }

}
