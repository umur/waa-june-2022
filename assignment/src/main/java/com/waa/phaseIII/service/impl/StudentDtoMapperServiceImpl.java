package com.waa.phaseIII.service.impl;

import com.waa.phaseIII.dto.CourseDto;
import com.waa.phaseIII.dto.StudentDto;
import com.waa.phaseIII.entity.Course;
import com.waa.phaseIII.entity.Student;
import com.waa.phaseIII.repo.StudentDtoMapperRepo;
import com.waa.phaseIII.service.StudentDtoMapperService;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentDtoMapperServiceImpl implements StudentDtoMapperService {
    private StudentDtoMapperRepo studentDtoMapperRepo;

    @Autowired
    private ModelMapper modelMapper;


    @Autowired
    private StudentDtoMapperServiceImpl(StudentDtoMapperRepo studentDtoMapperRepo) {
        this.studentDtoMapperRepo = studentDtoMapperRepo;
    }


    public CourseDto courseEntityToDto(Course course) {
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        CourseDto courseDto = new CourseDto();
        courseDto = modelMapper.map(course, CourseDto.class);
        return courseDto;
    }

    public StudentDto entityToDto(Student student) {
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        StudentDto studentDto = new StudentDto();
        studentDto = modelMapper.map(student, StudentDto.class);
        return studentDto;
    }

    public Student dtoToEntity(StudentDto studentDto) {
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        Student student = new Student();
        student = modelMapper.map(studentDto, Student.class);
        return student;
    }


    @Override
    public List<StudentDto> findAll() {
        List<Student> student = studentDtoMapperRepo.findAll();
        List<StudentDto> dtos = new ArrayList<>();
        for (Student stu : student) {
            dtos.add(entityToDto(stu));
        }
        return dtos;
    }

    @Override
    public List<StudentDto> getByMajor(String major) {
        List<Student> student = studentDtoMapperRepo.getByMajor(major);
        List<StudentDto> dtos = new ArrayList<>();
        for (Student stu : student) {
            dtos.add(entityToDto(stu));
        }
        return dtos;
    }

    @Override
    public List<CourseDto> getCoursesByStudentId(int studentId) {
        List<Course> courses = studentDtoMapperRepo.getCoursesByStudentId(studentId);
        List<CourseDto> dtos = new ArrayList<>();
        for (Course course : courses) {
            CourseDto courseDto = new CourseDto();
            dtos.add(courseEntityToDto(course));
        }
        return dtos;
    }

    @Override
    public void save(StudentDto stu) {
        Student student = dtoToEntity(stu);
        studentDtoMapperRepo.save(student);
    }

    @Override
    public void update(StudentDto stu) {
        Student student = dtoToEntity(stu);
        studentDtoMapperRepo.update(student);
    }

    @Override
    public void delete(int id) {
        studentDtoMapperRepo.delete(id);
    }
}
