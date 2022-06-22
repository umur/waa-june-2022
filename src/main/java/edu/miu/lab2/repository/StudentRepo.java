package edu.miu.lab2.repository;

import edu.miu.lab2.entity.Course;
import edu.miu.lab2.entity.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class StudentRepo {

    List<Student> students = new ArrayList<>();

    public StudentRepo() {
        List<Course> c1 = Arrays.asList(
                new Course(1, "Java", "CS111"),
                new Course(2, "big data", "CS200")
        );
        Student s1 = new Student(1, "Nirmal", "Silwal", "nsilwal@gmail.com", "CSE", "WAA", 5.5, c1);

        List<Course> c2 = Arrays.asList(
                new Course(1, "Python", "CS333"),
                new Course(2, "Cloud Computing", "CS400")
        );
        Student s2 = new Student(2, "Pravash", "Upreti", "pupreti@gmail.com", "ECE", "WAA", 4.5, c2);

        students.add(s1);
        students.add(s2);

        List<Student> newList = students.stream().filter(student -> student.getId() == 1).toList();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public ResponseEntity<Student> updateStudent(Student student, int id) {
        Student  updatedStudent =  students.stream().filter(s -> s.getId() == id).findFirst().get();
        int indexToUpdate = students.indexOf(updatedStudent);

        students.set(indexToUpdate, student);

        return new ResponseEntity<>(updatedStudent, HttpStatus.OK);
    }

    public void deleteStudent(int id) {
        students.removeIf(s -> s.getId() == id);
    }
}
