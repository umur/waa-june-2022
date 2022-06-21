package com.lab.phase1.service.impl;

import com.lab.phase1.model.Student;
import com.lab.phase1.repo.StudentRepo;
import com.lab.phase1.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepo studentRepo;

    @Override
    public List<Student> findAll() {
        var students= studentRepo.findAll();
        var result = new ArrayList<Student>();

        for (Student student: students) {
            result.add(student);
        }
        return result;
    }

    @Override
    public void create(Student student) { studentRepo.create(student);}
}
