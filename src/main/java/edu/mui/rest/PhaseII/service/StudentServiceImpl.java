package edu.mui.rest.PhaseII.service;

import edu.mui.rest.PhaseII.dto.StudentDto;
import edu.mui.rest.PhaseII.entity.Course;
import edu.mui.rest.PhaseII.entity.Student;
import edu.mui.rest.PhaseII.repo.StudentRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private StudentRepo studentRepo;

    @Override
    public ArrayList<StudentDto> findAll() {
        var students = studentRepo.findAll();
        var result = new ArrayList<StudentDto>();

        for(Student student: students){
            StudentDto dto = new StudentDto();
            var courseDto =dto.toDto(student);
            result.add(courseDto);
        }
        return result;
    }

    @Override
    public ArrayList<StudentDto> findByMajor(String major) {

        var studentWithMajor = studentRepo.findByMajor(major);
        var result = new ArrayList<StudentDto>();
        for(Student student: studentWithMajor){
            StudentDto dto = new StudentDto();
            var courseDto =dto.toDto(student);
            result.add(courseDto);
        }
        return result;
    }

    @Override
    public List<Course> findCoursesByStudentId(int id) {
        return studentRepo.findCoursesByStudentId(id);
    }

    @Override
    public Student addStudents(StudentDto studentDto) {
        return studentRepo.addStudent(studentDto.toEntity());
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
