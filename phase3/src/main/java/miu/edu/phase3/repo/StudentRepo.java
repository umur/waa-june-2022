package miu.edu.phase3.repo;

import miu.edu.phase2.dto.CourseDto;
import miu.edu.phase2.dto.StudentDto;
import miu.edu.phase2.entity.Course;
import miu.edu.phase2.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {
    private static List<StudentDto> students = new ArrayList<>();

    public StudentRepo() {
        Student s1 = new Student(1, "Anjana", "Sharma","ansharma@miu.edu", "compro", (float) 3.6);
        Student s2 = new Student(2, "Bijaya", "Parajuli","sharma@miu.edu", "compro", (float) 3.95);
        CourseDto c1 = new Course(1, "WAA", "CS545");
        CourseDto c2 = new Course(2, "WAP", "CS472");

        s1.addCourse(c1);
        s2.addCourse(c1);
        s1.addCourse(c2);
        s2.addCourse(c2);

        students.add(s1);
        students.add(s2);
    }

    public List<StudentDto> findAll() {
        return students;
    }

    public StudentDto create(StudentDto student) {
        students.add(student);
        return student;
    }

    public StudentDto update(StudentDto student, int id) {
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

    public StudentDto findOne(int id) {
        return students.stream().filter(stu -> stu.getId() == id).findFirst().get();
    }
}
