package edu.mui.rest.PhaseII.repo;

import edu.mui.rest.PhaseII.entity.Course;
import edu.mui.rest.PhaseII.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class StudentRepo {

    static int id = 3;

    private static List<Student> students = new ArrayList<>();


    public StudentRepo(){
        Course course1 = new Course(1,"WAA","576");
        Course course2 = new Course(2,"WAP","576");
        List<Course> courses = List.of(course1,course2);

        Student student = new Student(1,"Sardorbek","Abdupattaev","sardor979bek@gmail.com", "CSE",courses, 3.7);
        Student student2 = new Student(2,"Sardorbek2","Abdupattaev2","sardordoom@gmail.com", "CSE",courses, 3.9);

        students.addAll(List.of(student, student2));
    }

    public List<Student> findAll() {
        return students;
    }

    public Student findById(int id) {
        return students.stream().filter(student -> student.getId() == id).findFirst().orElse(null);
    }

    public List<Student> findByMajor(String major){
        return students.stream().filter(student -> student.getMajor().equals(major)).collect(Collectors.toList());
    }


    public List<Course> findCoursesByStudentId(int id) {
        Student student = findById(id);
        return student.getTakenCourses();
    }

    public Student addStudent(Student student){
        student.setId(id);
        students.add(student);
        id++;
        return student;
    }

    public Student updateStudent(Student student) {
        int id = student.getId();
        Student studentRef = findById(id);
        studentRef.setFirstName(student.getFirstName());
        studentRef.setLastName(student.getLastName());
        studentRef.setMajor(student.getMajor());
        studentRef.setGpa(student.getGpa());
        studentRef.setEmail(student.getEmail());
        studentRef.setTakenCourses(student.getTakenCourses());
        return studentRef;
    }

    public void deleteStudentById(int id){
        Student student = findById(id);
        students.remove(student);
    }
}
