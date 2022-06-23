package com.phase3.domain;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
public class Student {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
    private List<Course> coursesTaken;
    private double gpa;

    public Student() {}

    public Student(Long id, String firstName, String lastName, String email, String major){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.major = major;
        this.coursesTaken = new ArrayList<>();
    }

    public void addCourse(Course course){
        this.coursesTaken.add(course);
    }
}
