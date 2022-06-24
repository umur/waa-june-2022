package miu.edu.phasei.repo;

import miu.edu.phasei.entity.Course;
import miu.edu.phasei.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class StudentRepo {
    private static List<Student> students = new ArrayList<>();

    public StudentRepo() {
        Student s1 = new Student(1, "Anjana", "Sharma","ansharma@miu.edu", "compro", (float) 3.6);
        Student s2 = new Student(2, "Bijaya", "Parajuli","sharma@miu.edu", "compro", (float) 3.95);
        Course c1 = new Course(1, "WAA", "CS545");
        Course c2 = new Course(2, "WAP", "CS472");

        s1.addCourse(c1);
        s2.addCourse(c1);
        s1.addCourse(c2);
        s2.addCourse(c2);

        students.add(s1);
        students.add(s2);
    }

    public List<Student> findAll() {
        return students;
    }

    public Student create(Student student) {
        students.add(student);
        return student;
    }

    public Student update(Student student, int id) {
        var std = students.stream().filter(stu -> stu.getId() == id).findFirst();
        if(std.isPresent()) {
            students.remove(std);
            students.add(student);
        }

        return student;
    }

    public void delete(int id) {
        var stu = students.stream().filter(std -> std.getId() == id) .findFirst();

        if(stu.isPresent()){
            students.remove(stu);
        }
    }

    public Student findOne(int id) {
        return students.stream().filter(stu -> stu.getId() == id).findFirst().get();
    }
}
