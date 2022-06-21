package com.lab.phase1.repo;

import com.lab.phase1.model.Student;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    private static List<Student> students = new ArrayList<>();

    public List<Student> findAll() {
        return students;
    }

    public void create(Student s) { students.add(s);}
}
