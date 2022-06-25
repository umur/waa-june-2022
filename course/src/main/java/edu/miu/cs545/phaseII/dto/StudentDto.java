package edu.miu.cs545.phaseII.dto;

import edu.miu.cs545.phaseII.entity.Course;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class StudentDto implements Serializable {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
    private List<Course> coursesTaken;
    private Double gpa;
}
