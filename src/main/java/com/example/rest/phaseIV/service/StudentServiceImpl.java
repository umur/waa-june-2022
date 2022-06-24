package com.example.rest.phaseIV.service;

import com.example.rest.phaseIV.dto.CourseDto;
import com.example.rest.phaseIV.dto.StudentDto;
import com.example.rest.phaseIV.entity.Course;
import com.example.rest.phaseIV.entity.Student;
import com.example.rest.phaseIV.repo.StudentRepo;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepo studentRepo;
    ModelMapper modelMapper;
//    @Override
//    public void createStudent() {
//        studentRepo.createStudent();
//    }

    @Override
    public void createStudent(StudentDto studentDto) {
        Student s = modelMapper.map(studentDto, Student.class);
        studentRepo.createStudent(s);
    }

    @Override
    public void deleteStudent(StudentDto studentDto) {
        Student s = modelMapper.map(studentDto, Student.class);
        studentRepo.deleteStudent(s);
    }

    @Override
    public Student getStudent(int id) {
        return studentRepo.getStudent(id);
    }

    @Override
    public void update(StudentDto studentDto) {
        Student s = modelMapper.map(studentDto, Student.class);
        studentRepo.update(s);
    }


    public List<StudentDto> getStudentsByMajor(String major) {
        List<Student> students = studentRepo.getStudentsByMajor(major);
//        List<StudentDto> studentDtos = new ArrayList<>();
//        for (Student s: students) {
//            StudentDto studentDto = modelMapper.map(s, StudentDto.class);
//            studentDtos.add(studentDto);
//        }

        List<StudentDto> studentDtos = students.stream()
                .map(s -> modelMapper.map(s, StudentDto.class))
                .collect(Collectors.toList());

        return studentDtos;
    }


    public List<CourseDto> getCoursesByStudentId(int id) {

        List<Course> courses = studentRepo.getCoursesByStudentId(id);

        return courses.stream()
                .map(course -> modelMapper.map(course, CourseDto.class))
                .collect(Collectors.toList());

    }
}
