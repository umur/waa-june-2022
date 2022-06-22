package edu.miu.phase2.dto;

import edu.miu.phase2.entity.Course;
import edu.miu.phase2.entity.Student;
import lombok.Data;

import java.util.List;

@Data
public class StudentDTO {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
    private String coursesTaken;
    private double gpa;

    private List<Course> courses;

    public StudentDTO toDTO(Student student) {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(student.getId());
        studentDTO.setFirstName(student.getFirstName());
        studentDTO.setLastName(student.getLastName());
        studentDTO.setEmail(student.getEmail());
        studentDTO.setMajor(student.getMajor());
        studentDTO.setCoursesTaken(student.getCoursesTaken());
        studentDTO.setGpa(student.getGpa());

        return studentDTO;
    }

    public Student toEntity() {
        Student student = new Student();
        student.setId(this.getId());
        student.setFirstName(this.getFirstName());
        student.setLastName(this.getLastName());
        student.setEmail(this.getEmail());
        student.setMajor(this.getMajor());
        student.setCoursesTaken(this.getCoursesTaken());
        student.setGpa(this.getGpa());

        return student;
    }
}
