package edu.miu.phase2.dto;

import edu.miu.phase2.entity.Course;
import edu.miu.phase2.entity.Student;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class StudentDto {
    private static int idIncrement = 1;

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
    private List<CourseDto> coursesTaken;
    private double gpa;


    public Student toStudent() {
        List<Course> courseList = new ArrayList<>();
        for(CourseDto courseDto: coursesTaken) {
            Course newCourse = new Course(courseDto.getId(), courseDto.getName(), courseDto.getCode());
            courseList.add(newCourse);
        }

        if(id == 0)
            id = idIncrement++;

        return new Student(id, firstName, lastName, email, major, courseList, gpa);
    }
}
