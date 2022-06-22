package edu.miu.rest.dto;

import edu.miu.rest.entity.Course;
import edu.miu.rest.entity.Student;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class StudentDto {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
    private String coursesTaken;
    private int gpa;
    private static List<Course> courses = new ArrayList<>();

    public StudentDto toDto(Student student){
        StudentDto dto = new StudentDto();
        dto.setId(student.getId());
        dto.setFirstName(student.getFirstName());
        dto.setLastName(student.getLastName());
        dto.setEmail(student.getEmail());
        dto.setMajor(student.getMajor());
        dto.setCoursesTaken(student.getCoursesTaken());
        dto.setGpa(student.getGpa());
        dto.setCourses(student.getCourses());
        return dto;
    }

    public Student toEntity(){
        Student student = new Student();
        student.setId(this.id);
        student.setFirstName(this.firstName);
        student.setLastName(this.lastName);
        student.setEmail(this.email);
        student.setMajor(this.major);
        student.setCoursesTaken(this.coursesTaken);
        student.setGpa(this.gpa);
        student.setCourses(this.courses);
        return student;
    }

    public static List<Course> getCourses() {
        return courses;
    }

    public static void setCourses(List<Course> courses) {
        StudentDto.courses = courses;
    }

}
