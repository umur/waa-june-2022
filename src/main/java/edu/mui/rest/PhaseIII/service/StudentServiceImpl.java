package edu.mui.rest.PhaseIII.service;

import edu.mui.rest.PhaseIII.dto.StudentDto;
import edu.mui.rest.PhaseIII.entity.Course;
import edu.mui.rest.PhaseIII.entity.Student;
import edu.mui.rest.PhaseIII.repo.StudentRepo;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private StudentRepo studentRepo;
    private ModelMapper mapper;

    @Override
    public ArrayList<StudentDto> findAll() {
        var students = studentRepo.findAll();
        var result = new ArrayList<StudentDto>();

        for(Student student: students){
            var courseDto =toDto(student);
            result.add(courseDto);
        }
        return result;
    }

    @Override
    public ArrayList<StudentDto> findByMajor(String major) {

        var studentWithMajor = studentRepo.findByMajor(major);
        var result = new ArrayList<StudentDto>();
        for(Student student: studentWithMajor){
            var courseDto =toDto(student);
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
        return studentRepo.addStudent(toEntity(studentDto));
    }

    @Override
    public Student updateStudent(StudentDto studentDto) {
        return studentRepo.updateStudent(toEntity(studentDto));
    }

    @Override
    public void deleteStudentById(int id) {
        studentRepo.deleteStudentById(id);
    }

    private StudentDto toDto(Student student){
        StudentDto dto = mapper.map(student, StudentDto.class);
        return dto;
    }
    public Student toEntity(StudentDto studentDto){
        Student student = mapper.map(studentDto, Student.class);
        return student;
    }

}
