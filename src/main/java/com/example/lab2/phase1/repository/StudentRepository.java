package com.example.lab2.phase1.repository;

import com.example.lab2.phase1.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class StudentRepository {
    private static List<Student> studentList = new ArrayList<>();

    public StudentRepository() {
        Student james = new Student(1, "James", "Bond", "james@gmail.com", "WAA", "ASD", 4);
        Student ashley = new Student(2, "ashley", "weather", "ashley@gmail.com", "EA", "ASD", 4);
        studentList.add(james);
        studentList.add(ashley);
    }

    ///////////Implement CRUD Operations for the domains

    //create
    public void create(Student student) {
        studentList.add(student);
    }

    //retrieve
    public List<Student> findAll() {
        return studentList;
    }

    //retrieve the students based on the specific major
    public List<Student> getStudentsByMajor(String major){
        return studentList.stream()
                .filter( e -> e.getMajor().equals(major))
                .collect(Collectors.toList());
    }
    //update the course
    public void updateStudent(Student student) {
        if (hasStudent(student)) {
            Student getStudent = studentList.get(student.getId());
            //update the current course;
        }
    }

    //delete the course
    public void deleteStudent(Student student) {
        if (hasStudent(student)) {
            studentList.remove(student);
        }
    }

    //checking we have this course or not
    public Boolean hasStudent(Student student) {
        return studentList.contains(student);
    }

}
