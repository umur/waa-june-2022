package miu.edu.phase3.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class StudentDto {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
    private float gpa;
    private List<CourseDto> coursesTaken;

    public StudentDto(int id, String firstName, String lastName, String email, String major, float gpa){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.major = major;
        this.gpa = gpa;
        this.coursesTaken = new ArrayList<>();
    }
    public void addCourse(CourseDto course){
        this.coursesTaken.add(course);
    }
}
