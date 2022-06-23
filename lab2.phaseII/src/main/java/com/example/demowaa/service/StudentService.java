package com.example.demowaa.service;

import com.example.demowaa.Dto.CourseDto;
import com.example.demowaa.Dto.StudentDto;
import com.example.demowaa.Entity.Course;
import com.example.demowaa.Entity.Student;
import com.example.demowaa.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
@Service
@Transactional
public class StudentService implements IStudentService{
    @Autowired
    private StudentRepo studentRepo;
    @Override
    public List<StudentDto> findAll() {
        var students = studentRepo.findAll();
        var result = new ArrayList<StudentDto>();

        for (Student stu : students) {
            StudentDto dto = new StudentDto();
            var studentDto = dto.toDto(stu);
            result.add(studentDto);
        }
        return result;
    }

    @Override
    public void create(StudentDto dto) {
        var entity = dto.toEntity();
        studentRepo.create(entity);
    }

    @Override
    public String delete(int id) {
        return studentRepo.delete(id);
    }

    @Override
    public boolean update(StudentDto c, int id) {
        var student=c.toEntity();
        return studentRepo.update(student,id);
    }
}
