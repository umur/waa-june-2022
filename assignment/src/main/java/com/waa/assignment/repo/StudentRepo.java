package com.waa.assignment.repo;

import com.waa.assignment.entity.Course;
import com.waa.assignment.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

@Repository
public class StudentRepo {
    ArrayList<Student> students = new ArrayList<>();
    List<Course> courses = new ArrayList<>();

    public StudentRepo() {
        Course course1 = new Course(1, "WAA", "02");
        Course course2 = new Course(1, "MPP", "03");
        courses.add(course1);
        courses.add(course2);

        Student stu1 = new Student(1, "Ashish", "Pokhrel", "a@g.com", "COMPRO", courses, 3.98);
        Student stu2 = new Student(2, "two", "Pokhrel", "a@g.com", "MBA", courses, 3.8);
        Student stu3 = new Student(3, "three", "Pokhrel", "a@g.com", "COMPRO", courses, 3.44);

        students.add(stu1);
        students.add(stu2);
        students.add(stu3);
    }

    public List<Student> findAll() {
        return students;
    }

    public List<Student> getByMajor(String major) {
        return students.stream().filter(x -> x.getMajor().equals(major)).toList();
    }

    public List<Course> getCoursesByStudentId(int studentId) {
        for (Student stu : students) {
            if (stu.getId() == studentId)
                return stu.getCourseList();
        }
        return null;
    }

    public void save(Student stu) {
        students.add(stu);
    }

    public void update(Student stu) {
        var stud = students.stream().filter(x -> x.getId() == stu.getId()).findAny().get();
        students.set(students.indexOf(stud), stu);
    }

    public void delete(int id) {
        students.remove(id);
    }
}
