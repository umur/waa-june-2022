package edu.miu.lab2.phase2.service.studentservice;

import edu.miu.lab2.phase2.dto.StudentDto;
import edu.miu.lab2.phase2.entity.Student;
import edu.miu.lab2.phase2.repo.StudentRepoP2;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@AllArgsConstructor
public class StudentServiceImplP2 implements StudentService {

    private final StudentRepoP2 studentRepo;
    @Override
    public List<StudentDto> getStudent() {
        return studentRepo.findAll().stream().map(student -> new StudentDto().toDto(student)).toList();
    }

    @Override
    public void deleteStudent( int id) {
        studentRepo.deleteStudent(id);
    }

    @Override
    public void createStudent(StudentDto student) {
    studentRepo.createStudent(student.toEntity());
    }

    @Override
    public void updateStudent(StudentDto s, int id) {
        studentRepo.updateStudent(s.toEntity(),id);
    }

}
