package com.miu.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@Data
@AllArgsConstructor
public class Student {

    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String major;

    private double gpa;

    private List<Course> coursesTaken;

    private boolean deleted;

    public void addCourse(Course course) {
        this.coursesTaken.add(course);
    }

    public Student(Long id, String firstName, String lastName, String email, String major) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.major = major;
        this.gpa = gpa;

    }
}
