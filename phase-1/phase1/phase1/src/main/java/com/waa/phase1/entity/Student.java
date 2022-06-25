package com.waa.phase1.entity;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private int id;

    private String firstName;

    private String lastName;

    private String email;

    private String major;

    private List<Course> courseTaken;

    private double gpa;

}
