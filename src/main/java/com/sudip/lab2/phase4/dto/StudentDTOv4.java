package com.sudip.lab2.phase4.dto;

import com.sudip.lab2.phase4.entity.Course;
import lombok.Data;

import java.util.List;

@Data
public class StudentDTOv4 {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
    private List<Course> courseTaken;
    private double gpa;


}
