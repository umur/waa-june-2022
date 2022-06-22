package com.lab.phase1.service.impl;

import com.lab.phase1.model.Course;
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

    @Override
    public void delete(int id) {studentRepo.deleteById(id);}

    @Override
    public List<Student> findByMajor(String major) {
        var students = studentRepo.findAll();
        var result = new ArrayList<Student>();

        String variable = major.substring(1, major.length()-1);
        for (Student student: students) {
            if (student.getMajor().contentEquals(variable)) {
                result.add(student);
            }
        }
        return result;
    }

    @Override
    public List<Course> findByIdCourses(int id) {
        var student = studentRepo.findById(id);
        return student.getCourseTaken();
    }
}
