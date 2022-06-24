package phaseI.miu.cs545.course.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student{
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
    private List<Course> coursesTaken;
    private Double gpa;

    public Student(int id, String firstName, String lastName, String email, String major, Double gpa) {
        this.id = id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.major=major;
        this.gpa=gpa;
        this.coursesTaken=new ArrayList<>();
    }
    public void addCoursesTaken(Course course){
        coursesTaken.add(course);
    }
}
