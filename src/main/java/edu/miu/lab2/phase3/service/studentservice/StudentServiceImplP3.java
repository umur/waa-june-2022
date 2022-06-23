package edu.miu.lab2.phase3.service.studentservice;

import edu.miu.lab2.phase3.dto.StudentDtoP3;
import edu.miu.lab2.phase3.entity.Student;
import edu.miu.lab2.phase3.repo.StudentRepoP3;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class StudentServiceImplP3 implements StudentService {

    private final StudentRepoP3 studentRepo;
    private final ModelMapper modelMapper;
    @Override
    public List<StudentDtoP3> getStudent() {
        return studentRepo.findAll().stream().map(student -> modelMapper.map(student,StudentDtoP3.class)).toList();
        //return studentRepo.findAll().stream().map(student -> new StudentDtoP3().toDto(student)).toList();
    }

    @Override
    public void deleteStudent( int id) {
        studentRepo.deleteStudent(id);
    }

    @Override
    public void createStudent(StudentDtoP3 student) {
    //studentRepo.createStudent(student.toEntity());
        studentRepo.createStudent(modelMapper.map(student, Student.class));
    }

    @Override
    public void updateStudent(StudentDtoP3 s, int id) {
        studentRepo.updateStudent(modelMapper.map(s,Student.class),id);
        //studentRepo.updateStudent(s.toEntity(),id);
    }

}
