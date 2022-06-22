package edu.miu.lab2.services.impl;

import edu.miu.lab2.entity.Course;
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
       return this.studentRepo.getStudents();
    }

    @Override
    public void addStudent(Student student) {
        this.studentRepo.addStudent(student);
    }

    @Override
    public void updateStudent(Student student, int id) {
        this.studentRepo.updateStudent(student, id);
    }

    @Override
    public void deleteStudent(int id) {
       this.studentRepo.deleteStudent(id);
    }

    @Override
    public Student getStudentsByMajor(String major) {
        return this.studentRepo.getStudentsByMajor(major);
    }
    @Override
    public List<Course> getCoursesByStudentId(int id) {
        return this.studentRepo.getCoursesByStudentId(id);
    }
}
