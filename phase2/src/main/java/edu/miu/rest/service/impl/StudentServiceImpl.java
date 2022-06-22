package edu.miu.rest.service.impl;

import edu.miu.rest.repo.StudentRepo;
import edu.miu.rest.dto.StudentDto;
import edu.miu.rest.entity.Course;
import edu.miu.rest.entity.Student;
import edu.miu.rest.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private StudentRepo studentRepo;

    @Override
    public List<StudentDto> findAll() {
        var students = studentRepo.findAll();
        var result = new ArrayList<StudentDto>();

        for(Student student: students){
            StudentDto dto = new StudentDto();
            var courseDto = dto.toDto(student);
            result.add(courseDto);
        }
        return result;
    }

    @Override
    public List<StudentDto> findByMajor(String major) {

        var studentsByMajor = studentRepo.findByMajor(major);
        var result = new ArrayList<StudentDto>();
        for(Student student: studentsByMajor){
            StudentDto dto = new StudentDto();
            var courseDto = dto.toDto(student);
            result.add(courseDto);
        }
        return result;
    }

    @Override
    public List<Course> findCoursesByStudentId(int id) {
        return studentRepo.findCoursesByStudentId(id);
    }

    @Override
    public void addStudent(StudentDto studentDto) {
        studentRepo.addStudent(studentDto.toEntity());
    }

    @Override
    public Student updateStudent(StudentDto studentDto) {
        return studentRepo.updateStudent(studentDto.toEntity());
    }

    @Override
    public void deleteStudentById(int id) {
        studentRepo.deleteStudentById(id);
    }
}
