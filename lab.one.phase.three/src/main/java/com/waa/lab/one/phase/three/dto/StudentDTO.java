package com.waa.lab.one.phase.three.dto;

import com.waa.lab.one.phase.three.entiry.Student;
import lombok.Data;

@Data
public class StudentDTO {

    private Long id;

    private String firstname;

    private String lastname;

    private String email;

    private String major;

    private String gpa;

}
