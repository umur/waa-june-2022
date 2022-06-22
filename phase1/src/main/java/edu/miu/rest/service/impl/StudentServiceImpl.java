package edu.miu.rest.service.impl;

import edu.miu.rest.service.StudentService;
import edu.miu.rest.entity.Course;
import edu.miu.rest.entity.Student;
import edu.miu.rest.repo.StudentRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private StudentRepo studentRepo;

    @Override
    public List<Student> findAll() {
        var students = studentRepo.findAll();
        return students;
    }

    @Override
    public List<Student> findByMajor(String major) {
        var studentWithMajor = studentRepo.findByMajor(major);
        return studentWithMajor;
    }

    @Override
    public List<Course> findCoursesByStudentId(int id) {
        return studentRepo.findCoursesByStudentId(id);
    }

    @Override
    public Student addStudents(Student student) {
        return studentRepo.addStudent(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepo.updateStudent(student);
    }

    @Override
    public void deleteStudentById(int id) {
        studentRepo.deleteStudentById(id);
    }
}
