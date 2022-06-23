package com.Lab02.Assignment.Phase4.client.js.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private  int id;
    private  String firstName;
    private  String lastName;
    private  String email;
    private  String major;
    private  String gpa;
    private List<Course> coursesTaken;
}
