package com.example.lab2.phase2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
    private String courseTaken;
    private Integer gpa;
}
