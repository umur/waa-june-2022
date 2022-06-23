package com.example.demo.dto;

import com.example.demo.entity.Course;
import com.example.demo.entity.Student;
import lombok.Data;

import java.util.List;

@Data
public class StudentDTO {
  private int id;
  private String firstName;
  private String lastName;
  private String email;
  private String major;
  private List<Course> coursesTaken;
  private double gpa;

  public StudentDTO toDto(Student student) {
    StudentDTO studentDTO = new StudentDTO();
    studentDTO.setId(student.getId());
    studentDTO.setFirstName(student.getFirstName());
    studentDTO.setLastName(student.getLastName());
    studentDTO.setEmail(student.getEmail());
    studentDTO.setGpa(student.getGpa());
    studentDTO.setMajor(student.getMajor());
    studentDTO.setCoursesTaken(student.getCoursesTaken());
    return studentDTO;
  }

  public Student toEntity() {
    Student student = new Student();
    student.setId(this.id);
    student.setFirstName(this.firstName);
    student.setEmail(this.email);
    student.setGpa(this.gpa);
    student.setMajor(this.major);
    student.setCoursesTaken(this.coursesTaken);
    return student;
  }
}
