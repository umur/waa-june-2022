package rest.cs545_waa_lab2_dto.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
    private List<Course> courses;
    private double gpa;
}
