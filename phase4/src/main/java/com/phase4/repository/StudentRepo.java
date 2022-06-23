package com.phase4.repository;

import com.phase4.domain.Course;
import com.phase4.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class StudentRepo {

    private static List<Student> students = new ArrayList<>();

    static {
        Student student1 = new Student(1L,"John","j","john@gmail.com","compro");
        Student student2 = new Student(1L,"James","k","james@gmail.com","mba");
        Course waaCourse = new Course(1L,"WAA","CS-543");
        Course mwaCourse = new Course(2L,"MWA","CS-546");
        student1.addCourse(waaCourse);
        student1.addCourse(mwaCourse);
        student2.addCourse(mwaCourse);
        student2.addCourse(waaCourse);
        students.add(student1);
        students.add(student2);
    }

    public Student save(Student student) {
        students.add(student);
        return student;
    }

    public Student update(Long id, Student student) {
        Student student1 = students.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if(student1 != null) {
            students.remove(student1);
            student.setId(id);
            students.add(student);
            return student;
        }

        return null;
    }

    public Student delete(Long id) {
        Student student = students.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if(student != null) {
            students.remove(student);
            return student;
        }

        return null;
    }

    public Student getByPK(Long id) {
        return students.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
    }

    public List<Student> getStudentsByMajor(String major) {
        return students.stream().filter(x -> x.getMajor() == major).collect(Collectors.toList());
    }

    public List<Course> getCoursesByStudentId(Long studentId) {
        Student student = students.stream().filter(x -> x.getId() == studentId).findFirst().orElse(null);

        if(student != null) {
            return student.getCoursesTaken();
        }

        return null;
    }

    public List<Student> getAll() {
        return students;
    }
}
