package edu.miu.rest.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
    private String coursesTaken;
    private int gpa;

    public static List<Course> getCourses() {
        return courses;
    }

    public static void setCourses(List<Course> courses) {
        Student.courses = courses;
    }

    private static List<Course> courses = new ArrayList<>();


}
