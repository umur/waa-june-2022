package com.example.rest.phaseI.repo;

import com.example.rest.phaseI.entity.Course;
import com.example.rest.phaseI.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Repository
public class StudentRepo {
    Set<Student> students = new HashSet<>();

    public StudentRepo() {
        Course c1 = new Course(1, "waa", "cs000");
        Course c2 = new Course(2, "mwa", "cs001");
        List<Course> courses = List.of(c1, c2);
        Student s1 = new Student(1,"Mubarek", "Ali", "xyz@gmil.com", "compro", courses, 3.8);

        List<Course> courses1 = List.of(c1);

        Student s2 = new Student(2,"Iqra", "Jemal", "xyz@gmil.com", "compro", courses1, 4.0);

        students.addAll(List.of(s1,s2));
    }



    // create
    public Student createStudent(Student s) {
        students.add(s);
        return s;
    }

    // delete
    public void deleteStudent(Student s) {
        students.remove(s);
    }

    // update
    public void update(Student s) {
       students.add(s);
    }

    // read
    public Student getStudent(int studentId) {
        for(Student s: students){
            if(s.getId() == studentId)
                return s;
        }
        return null;
    }

    public List<Student> getStudentsByMajor(String major) {
        List<Student> temp = new ArrayList<>();
        for(Student s: students) {
            if(s.getMajor().equals(major))
                temp.add(s);
        }
        return temp;
    }

    public List<Course> getCoursesByStudentId(int studentId){
        for(Student s: students){
            if(s.getId() == studentId)
                return s.getCoursesTaken();
        }
        return null;
    }
}
