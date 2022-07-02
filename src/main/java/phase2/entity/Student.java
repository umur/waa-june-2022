package phase2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student {

    private int id;

    private String firstname;

    private String lastname;

    private String email;

    private String major;

    private List<Course> courses;

    private String gpa;

}
