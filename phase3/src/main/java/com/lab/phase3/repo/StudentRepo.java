package com.lab.phase3.repo;

import com.lab.phase3.model.Course;
import com.lab.phase3.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {
    private static List<Student> students = new ArrayList<>();




    public StudentRepo() {
        List<Course> courses = new ArrayList<>();
        Course c1 = new Course(1, "MWA", "CS572");
        Course c2 = new Course(2, "WAA", "CS545");
        courses.add(c1);
        courses.add(c2);

        Student s1 = new Student(1, "John", "Doe", "john@gmail.com",  "CS",  new ArrayList<>(courses), 4.0);
        Student s2 = new Student(2, "Baby", "Bob", "bob@gmail.com",  "MBA", new ArrayList<>(courses), 4.0);
        students.add(s1);
        students.add(s2);
    }

    public List<Student> findAll() {return students;}

    public void create(Student s) {students.add(s);}

    public void delete(int id) {
        var found = students.stream().filter(s-> s.getId() ==id).findFirst().get();
        students.remove(found);
    }

    public void update(Student newStudent, int id) {
        Student oldStudent = findAll().stream()
                .filter(s-> s.getId() == id)
                .findFirst().get();
        oldStudent.setFirstName(newStudent.getFirstName());
        oldStudent.setLastName(newStudent.getLastName());
        oldStudent.setEmail(newStudent.getEmail());
        oldStudent.setGpa(newStudent.getGpa());
        oldStudent.setMajor(newStudent.getMajor());
        oldStudent.setCourseTaken(newStudent.getCourseTaken());
    }

    public Student findById(int id) {
        return students
                .stream()
                .filter(s-> s.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
