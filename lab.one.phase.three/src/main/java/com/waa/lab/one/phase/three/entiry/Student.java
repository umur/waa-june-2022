package com.waa.lab.one.phase.three.entiry;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student {

    private Long id;

    private String firstname;

    private String lastname;

    private String email;

    private String major;

    private List<Course> courseTaken;

    private String gpa;

}
