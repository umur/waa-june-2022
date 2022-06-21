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
}
