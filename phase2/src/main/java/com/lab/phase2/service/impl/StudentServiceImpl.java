package com.lab.phase2.service.impl;

import com.lab.phase2.dto.StudentDto;
import com.lab.phase2.model.Course;
import com.lab.phase2.model.Student;
import com.lab.phase2.repo.StudentRepo;
import com.lab.phase2.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    @Autowired
    private final StudentRepo studentRepo;

    @Override
    public List<StudentDto> findAll() {
        var students = studentRepo.findAll();
        var result = new ArrayList<StudentDto>();

        students.forEach(s-> {
            StudentDto dto = new StudentDto();
            var studentDto = dto.toDto(s);
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
        student.setFirstName(dto.getFName());
        student.setLastName(dto.getLName());
        student.setEmail(dto.getEmail());
        student.setGpa(dto.getGpa());
        student.setMajor(dto.getMajor());
        student.setCourseTaken(dto.getCourseTaken());
        studentRepo.update(student, id);
        return dto;
    }

    @Override
    public List<StudentDto> findByMajor(String major) {
        var students = studentRepo.findAll();
        var result = new ArrayList<StudentDto>();

        String variable = major.substring(1, major.length()-1);
        students.forEach(s-> {
            if (s.getMajor().contentEquals(variable)) {
                StudentDto dto = new StudentDto();
                var studentDto = dto.toDto(s);
                result.add(studentDto);
            } else {
                System.out.println("no");
            }
        });
        return result;
    }

    @Override
    public List<Course> findCoursesByStudentId(int id) {
        var student = studentRepo.findById(id);
        return student.getCourseTaken();
    }

}
