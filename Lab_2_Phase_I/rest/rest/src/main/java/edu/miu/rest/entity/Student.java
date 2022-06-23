package edu.miu.rest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Student {

    private int id;
    private  String fname;
    private String lname;
    private String email;
    private String major;
    private double gpa;
    private List<Course> coursesTaken ;
}
