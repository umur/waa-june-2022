package com.sudip.lab2.phase2.dto;

import com.sudip.lab2.phase2.entity.Course;
import com.sudip.lab2.phase2.entity.Student;
import lombok.Data;

import java.util.List;

@Data
public class StudentDTO {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
    private List<Course> courseTaken;
    private double gpa;

    public StudentDTO toStudentDto(Student student) {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(student.getId());
        studentDTO.setFirstName(student.getFirstName());
        studentDTO.setLastName(student.getLastName());
        studentDTO.setEmail(student.getEmail());
        studentDTO.setGpa(student.getGpa());
        studentDTO.setMajor(student.getMajor());
        studentDTO.setCourseTaken(student.getCourseTaken());
        return studentDTO;
    }

    public Student toStudentEntity() {
        Student student = new Student();
        student.setId(this.id);
        student.setEmail(this.email);
        student.setCourseTaken(this.courseTaken);
        student.setGpa(this.gpa);
        student.setFirstName(this.firstName);
        student.setLastName(this.lastName);
        student.setMajor(this.major);

        return student;
    }
}
