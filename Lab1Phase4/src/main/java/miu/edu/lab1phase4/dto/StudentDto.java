package miu.edu.lab1phase4.dto;

import lombok.Data;
import miu.edu.lab1phase4.entity.Course;
import miu.edu.lab1phase4.entity.Student;

import java.util.List;
@Data
public class StudentDto {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
    private List<Course> courseTaken;
    private double gpa;

//    public StudentDto toDto(Student student){
//        StudentDto dto = new StudentDto();
//        dto.setId(student.getId());
//        dto.setFirstName(student.getFirstName());
//        dto.setLastName(student.getLastName());
//        dto.setEmail(student.getEmail());
//        dto.setMajor(student.getMajor());
//        dto.setCourseTaken(student.getCourseTaken());
//        dto.setGpa(student.getGpa());
//        return dto;
//    }
//
//    public Student toEntity(){
//        Student student = new Student();
//        student.setId(this.id);
//        student.setFirstName(this.firstName);
//        student.setLastName(this.lastName);
//        student.setEmail(this.email);
//        student.setMajor(this.major);
//        student.setCourseTaken(this.courseTaken);
//        student.setGpa(this.getGpa());
//        return student;
//    }
}
