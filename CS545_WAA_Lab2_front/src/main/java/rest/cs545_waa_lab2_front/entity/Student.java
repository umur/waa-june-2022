package rest.cs545_waa_lab2_front.entity;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@Setter
@Getter
@Data
@RequiredArgsConstructor
public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String major;
    private List<Course> courses;
    private double gpa;


}
