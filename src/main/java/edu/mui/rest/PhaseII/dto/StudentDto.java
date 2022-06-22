package edu.mui.rest.PhaseII.dto;

import edu.mui.rest.PhaseII.entity.Course;
import edu.mui.rest.PhaseII.entity.Student;
import lombok.Data;

import java.util.List;

@Data
public class StudentDto {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
    private double gpa;
    private List<Course> takenCourses;


    public StudentDto toDto(Student student){
        StudentDto dto = new StudentDto();
        dto.setId(student.getId());
        dto.setFirstName(student.getFirstName());
        dto.setLastName(student.getLastName());
        dto.setEmail(student.getEmail());
        dto.setMajor(student.getMajor());
        dto.setGpa(student.getGpa());
        dto.setTakenCourses(student.getTakenCourses());
        return dto;
    }

    public Student toEntity(){
        Student student = new Student();
        student.setId(getId());
        student.setFirstName(getFirstName());
        student.setLastName(getLastName());
        student.setEmail(getEmail());
        student.setMajor(getMajor());
        student.setGpa(getGpa());
        student.setTakenCourses(getTakenCourses());
        return student;
    }

}
