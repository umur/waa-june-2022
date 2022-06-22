package edu.miu.rest.dto;

import edu.miu.rest.entity.Course;
import lombok.Data;

import java.util.List;

@Data
public class StudentDto {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
    private Double gpa;
    private List<Course> coursesTaken;


}
