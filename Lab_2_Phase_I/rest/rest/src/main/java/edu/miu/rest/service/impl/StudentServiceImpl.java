package edu.miu.rest.service.impl;

import edu.miu.rest.entity.Course;
import edu.miu.rest.entity.Student;
import edu.miu.rest.repository.StudentRepo;
import edu.miu.rest.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepo studentRepo;

    @Override
    public List<Student> findAll() {
        return studentRepo.findAll();
    }

    @Override
    public void create(Student student) {
        studentRepo.createStudent(student);
    }

    @Override
    public void update(Student student) {
        studentRepo.updateStudent(student);

    }

    @Override
    public void delete(Student student) {
        studentRepo.deleteStudent(student);  }

    @Override
    public List<Student> getStudentsByMajor(String major) {
        return studentRepo.getStudentsByMajor(major);
    }
    @Override
    public List<Course> getCoursesByStudentId(int studentId)
    {
        return studentRepo.getCoursesByStudentId(studentId);
    }
}
