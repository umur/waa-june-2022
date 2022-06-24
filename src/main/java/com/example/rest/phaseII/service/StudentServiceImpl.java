package com.example.rest.phaseII.service;

import com.example.rest.phaseII.dto.CourseDto;
import com.example.rest.phaseII.dto.StudentDto;
import com.example.rest.phaseII.entity.Course;
import com.example.rest.phaseII.entity.Student;
import com.example.rest.phaseII.repo.StudentRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepo studentRepo;
//    @Override
//    public void createStudent() {
//        studentRepo.createStudent();
//    }

    @Override
    public void createStudent(StudentDto studentDto) {
        studentDto.toEntity();

    }

    @Override
    public void deleteStudent(Student s) {
        studentRepo.deleteStudent(s);
    }

    @Override
    public Student getStudent(int id) {
        return studentRepo.getStudent(id);
    }

    @Override
    public void update(Student s) {
        studentRepo.update(s);
    }

    public List<StudentDto> getStudentsByMajor(String major) {
        List<Student> students = studentRepo.getStudentsByMajor(major);
        List<StudentDto> studentDtos = new ArrayList<>();

        for (Student s: students) {
            StudentDto studentDto = new StudentDto();
            studentDtos.add(studentDto.toDto(s));
        }
        return studentDtos;
    }


    public List<CourseDto> getCoursesByStudentId(int id) {

        List<Course> courses = studentRepo.getCoursesByStudentId(id);
        var courseDtos = new ArrayList<CourseDto>();

        for(Course c: courses) {
            CourseDto courseDto = new CourseDto();
            courseDtos.add(courseDto.toDto(c));
        }
        return courseDtos;
    }
}
