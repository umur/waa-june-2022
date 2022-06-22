package com.Lab02.Assignment.Phase1.dtos;

import com.Lab02.Assignment.Phase1.entity.Course;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;

    private char gpa;
    private List<Course> coursesTaken;
}
