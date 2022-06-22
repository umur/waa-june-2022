package edu.miu.phase2.services;

import edu.miu.phase2.dto.StudentDto;
import edu.miu.phase2.entity.Course;
import edu.miu.phase2.entity.Student;
import edu.miu.phase2.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public List<Student> findAllStudents(){
        return studentRepo.findAll();
    }
    public List<Student> getStudentsByMajor(String major){
        return studentRepo.findByMajor(major);
    }
    public List<Course> getCoursesByStudentId(int studentId){
        Student student = studentRepo.findById(studentId);
        return  student.getCoursesTaken();
    }
    public Student findStudentById(int id) {
        return studentRepo.findById(id);
    }

    public Student createStudent(StudentDto studentDto) {
        Student student = studentDto.toStudent();
        studentRepo.createOne(student);
        return student;
    }

    public Student updateStudent(StudentDto studentDto) throws Exception {
        Student student = studentDto.toStudent();
        return studentRepo.updateOne(student);
    }

    public Student removeStudentById(int studentId) throws Exception {
       return studentRepo.removeById(studentId);
    }
}
