package com.sudip.lab2.phase3.dto;

import com.sudip.lab2.phase3.entity.Course;
import com.sudip.lab2.phase3.entity.Student;
import lombok.Data;

import java.util.List;

@Data
public class StudentDTO {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
    private List<Course> courseTaken;
    private double gpa;


}
