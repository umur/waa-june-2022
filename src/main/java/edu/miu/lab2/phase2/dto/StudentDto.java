package edu.miu.lab2.phase2.dto;

import edu.miu.lab2.phase2.entity.Course;
import edu.miu.lab2.phase2.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
    private List<Course> courseTaken;
    private String gpa;

    public StudentDto toDto(Student student){
        StudentDto dto=new StudentDto();
        dto.setId(student.getId());
        dto.setFirstName(student.getFirstName());
        dto.setLastName(student.getLastName());
        dto.setEmail(student.getEmail());
        dto.setMajor(student.getMajor());
        dto.setCourseTaken(student.getCourseTaken());
        dto.setGpa(student.getGpa());
        return dto;
    }

    public Student toEntity(){
        Student student=new Student();
        student.setId(this.id);
        student.setFirstName(this.firstName);
        student.setLastName(this.lastName);
        student.setEmail(this.email);
        student.setMajor(this.major);
        student.setCourseTaken(this.courseTaken);
        student.setGpa(this.gpa);
        return student;
    }
}
