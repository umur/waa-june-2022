package com.example.demowaa.Dto;

import com.example.demowaa.Entity.Course;
import com.example.demowaa.Entity.Student;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class StudentDto {
    private int id;
    private String firstName;
    private String lastName;
    private List<Course> courses;
    private String major;
    private int gpa;
    private String email;

    public StudentDto toDto(Student s) {
        StudentDto st=new StudentDto();
        st.setEmail(s.getEmail());
        st.setId(s.getId());
        st.setCourses(s.getCourses());
        st.setFirstName(s.getFirstName());
        st.setLastName(s.getLastName());
        st.setGpa(s.getGpa());
        st.setMajor(s.getMajor());
        return st;

    }
    public Student toEntity(){
        Student s=new Student();
        s.setId(this.id);
        s.setFirstName(this.firstName);
        s.setLastName(this.lastName);
        s.setEmail(this.email);
        s.setCourses(this.courses);
        s.setMajor(this.major);
        s.setGpa(this.gpa);
        return s;

    }
}