package rest.cs545_waa_lab2_modelmapper.dto;

import lombok.Data;
import rest.cs545_waa_lab2_modelmapper.entity.Course;
import rest.cs545_waa_lab2_modelmapper.entity.Student;

import java.util.List;

@Data
public class StudentDto {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
    private List<Course> courses;
    private double gpa;


//    public StudentDto getStudentDto(Student student){
//
//        StudentDto dto = new StudentDto();
//        dto.setId(student.getId());
//        dto.setFirstName(student.getFirstName());
//        dto.setLastName(student.getLastName());
//        dto.setEmail(student.getEmail());
//        dto.setMajor(student.getMajor());
//        dto.setCourses(student.getCourses());
//        dto.setGpa(student.getGpa());
//
//        return dto;
//    }
//
//    public  Student toEntity(){
//        Student std= new Student();
//        std.setId(this.id);
//        std.setFirstName(this.lastName);
//        std.setLastName(this.lastName);
//        std.setEmail(this.email);
//        std.setMajor(this.major);
//        std.setCourses(this.courses);
//        std.setGpa(this.gpa);
//        return std;
//    }
}

