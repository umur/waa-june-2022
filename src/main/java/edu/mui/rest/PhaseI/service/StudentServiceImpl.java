package edu.mui.rest.PhaseI.service;

import edu.mui.rest.PhaseI.entity.Course;
import edu.mui.rest.PhaseI.entity.Student;
import edu.mui.rest.PhaseI.repo.StudentRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private StudentRepo studentRepo;

    @Override
    public List<Student> findAll() {
        var students = studentRepo.findAll();
//        var result = new ArrayList<StudentDto>();
//
//        for(Student student: students){
//            StudentDto dto = new StudentDto();
//            var courseDto =dto.toDto(student);
//            result.add(courseDto);
//        }
        return students;
    }

    @Override
    public List<Student> findByMajor(String major) {

        var studentWithMajor = studentRepo.findByMajor(major);
//        var result = new ArrayList<StudentDto>();
//        for(Student student: studentWithMajor){
//            StudentDto dto = new StudentDto();
//            var courseDto =dto.toDto(student);
//            result.add(courseDto);
//        }
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
