package com.sudip.lab2.phase4.repository;

import com.sudip.lab2.phase4.entity.Course;
import com.sudip.lab2.phase4.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepositoryv4 {
    List<Student> students = new ArrayList<>();

    public StudentRepositoryv4() {
        List<Course> courseTaken1 = new ArrayList<>();
        courseTaken1.add(new Course(2, "WAP", "CS445"));
        courseTaken1.add(new Course(5, "MPP", "CS444"));

        List<Course> courseTaken2 = new ArrayList<>();
        courseTaken2.add(new Course(1, "WAA", "CS545"));
        courseTaken2.add(new Course(3, "Algorithm", "CS404"));

        Student student1 = new Student(1, "Sudip", "Adhikari", "sudip@test.com", "WAP", courseTaken1, 4.0);
        Student student2 = new Student(2, "Saugat", "Lamichhane", "saugat@test.com", "WAP", courseTaken2, 4.0);
        students.add(student1);
        students.add(student2);
    }

    public void create(Student student) {
        students.add(student);
    }


    public void update(Student student, int id) {
        students.forEach(std -> {
            if (std.getId() == student.getId()) {
                students.set(students.indexOf(std), student);
            }
        });
    }

    public void remove(int id) {
        students.forEach(student -> {
            if (student.getId() == id) {
                students.remove(student);
            }
        });
    }


//

    public List<Student> findAll() {
        return students;
    }

    public List<Student> getStudentsByMajor(String major) {
        return students.stream().filter(student -> student.getMajor().equalsIgnoreCase(major)).toList();
    }

    public List<Course> getCoursesByStudentId(int studentId) {
        List<Course> courses = new ArrayList<>();

        students.forEach(student -> {
            if (student.getId() == studentId) {
                courses.addAll(student.getCourseTaken());
            }
        });
        return courses;

    }
}
