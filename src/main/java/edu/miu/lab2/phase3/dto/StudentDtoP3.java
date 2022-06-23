package edu.miu.lab2.phase3.dto;

import edu.miu.lab2.phase3.entity.Course;
import edu.miu.lab2.phase3.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDtoP3 {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
    private List<Course> courseTaken;
    private String gpa;



}
