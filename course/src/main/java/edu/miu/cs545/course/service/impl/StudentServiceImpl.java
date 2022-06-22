package edu.miu.cs545.course.service.impl;

import edu.miu.cs545.course.entity.Course;
import edu.miu.cs545.course.entity.Student;
import edu.miu.cs545.course.repository.StudentRepository;
import edu.miu.cs545.course.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void createNewStudent(Student student) {
        studentRepository.create(student);
    }

    @Override
    public void updateStudent(Student student, int id) {
        studentRepository.update(id, student);
    }

    @Override
    public void deleteStudent(int id) {
        studentRepository.delete(id);
    }

    @Override
    public List<Student> getStudentsByMajor(String major) {
        return studentRepository.getStudentsByMajor(major);
    }

    @Override
    public List<Course> getCoursesByStudentId(int id) {
        return studentRepository.getCourseByStudentId(id);
    }
}
