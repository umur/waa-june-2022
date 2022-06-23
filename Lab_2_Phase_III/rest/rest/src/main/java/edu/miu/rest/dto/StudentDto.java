package edu.miu.rest.dto;

import edu.miu.rest.entity.Course;
import edu.miu.rest.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
public class StudentDto {
    private int id;
    private  String fname;
    private String lname;
    private String email;
    private String major;
    private double gpa;
    private List<Course> coursesTaken ;

//    public StudentDto toDto(Student student)
//    {
//        StudentDto dto = new StudentDto();
//        dto.setId(student.getId());
//        dto.setFname(student.getFname());
//        dto.setLname(student.getLname());
//        dto.setEmail(student.getEmail());
//        dto.setMajor(student.getMajor());
//        dto.setGpa(student.getGpa());
//        dto.setCoursesTaken(student.getCoursesTaken());
//
//        return dto;
//    }
//
//    public Student toEntity()
//    {
//        Student student = new Student();
//        student.setId(this.id);
//        student.setFname(this.fname);
//        student.setLname(this.lname);
//        student.setEmail(this.email);
//        student.setMajor(this.major);
//        student.setGpa(this.gpa);
//        student.setCoursesTaken(this.coursesTaken);
//        return student;
//    }
}
