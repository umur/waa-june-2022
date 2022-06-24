package com.phase3.demo.dto;

import com.phase3.demo.entity.Course;
import lombok.Data;

import java.util.List;

@Data
public class StudentDto {
  private int id;
  private String firstName;
  private String lastName;
  private String email;
  private String major;
  private List<Course> coursesTaken;
  private double gpa;
}
