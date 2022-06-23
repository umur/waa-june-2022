package com.lab.phase3.service.impl;

import com.lab.phase3.dto.CourseDto;
import com.lab.phase3.dto.StudentDto;
import com.lab.phase3.model.Course;
import com.lab.phase3.model.Student;
import com.lab.phase3.repo.StudentRepo;
import com.lab.phase3.service.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private final StudentRepo studentRepo;

    @Autowired
    private final ModelMapper mapper;

    public StudentServiceImpl(StudentRepo studentRepo, ModelMapper mapper) {
        this.studentRepo = studentRepo;
        this.mapper = mapper;
    }


    @Override
    public List<StudentDto> findAll() {
        var students = studentRepo.findAll();
        var result = new ArrayList<StudentDto>();

        students.forEach(s-> {
            StudentDto studentDto = mapper.map(s, StudentDto.class);
            result.add(studentDto);
        });
        return result;
    }

    @Override
    public void create(StudentDto dto) {
        var entity = dto.toEntity();
        studentRepo.create(entity);
    }

    @Override
    public void delete(int id) {studentRepo.delete(id);}

    @Override
    public StudentDto update(StudentDto dto, int id) {
        Student student = new Student();
        student.setFirstName(dto.getFirstName());
        student.setLastName(dto.getLastName());
        student.setEmail(dto.getEmail());
        student.setGpa(dto.getGpa());
        student.setMajor(dto.getMajor());
        student.setCourseTaken(dto.getCourseTaken());
        studentRepo.update(mapper.map(dto, Student.class), id);
        return dto;
    }

    @Override
    public List<StudentDto> findByMajor(String major) {
        var students = studentRepo.findAll();
        var result = new ArrayList<StudentDto>();

        String variable = major.substring(1, major.length()-1);
        students.forEach(s-> {
            if (s.getMajor().contentEquals(variable)) {
                var studentDto = mapper.map(s, StudentDto.class);
                result.add(studentDto);
            }
        });
        return result;
    }

    @Override
    public List<CourseDto> findCoursesByStudentId(int id) {
        var student = studentRepo.findById(id);
        List<CourseDto> courseDtos = new ArrayList<>();
        for (Course course: student.getCourseTaken()) {
            CourseDto courseDto  = mapper.map(course, CourseDto.class);
            courseDtos.add(courseDto);
        }
        return courseDtos;
    }

}
