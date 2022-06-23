package com.phase3.dto;

import com.phase3.domain.Course;
import com.phase3.domain.Student;
import lombok.Data;

import java.util.List;

@Data
public class StudentDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
    private List<Course> coursesTaken;
    private double gpa;
}
