package edu.miu.phase3.dto;

import edu.miu.phase3.entity.Course;
import lombok.Data;

import java.util.List;

@Data
public class StudentDTO {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
    private String coursesTaken;
    private double gpa;

    private List<Course> courses;
}
