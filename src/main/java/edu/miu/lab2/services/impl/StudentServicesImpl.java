package edu.miu.lab2.services.impl;

import edu.miu.lab2.entity.Student;
import edu.miu.lab2.repository.StudentRepo;
import edu.miu.lab2.services.StudentServices;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentServicesImpl implements StudentServices {

    private final StudentRepo studentRepo;

    @Override
    public List<Student> getStudents() {
        return null;
    }

    @Override
    public boolean addStudent(Student student) {
        return false;
    }

    @Override
    public void updateStudent(Student student, int id) {

    }

    @Override
    public int deleteStudent(int id) {
        return 0;
    }
}
