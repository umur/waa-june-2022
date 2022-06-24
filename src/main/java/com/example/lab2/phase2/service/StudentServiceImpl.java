package com.example.lab2.phase2.service;


import com.example.lab2.phase2.DTO.StudentDTO;
import com.example.lab2.phase2.entity.Student;
import com.example.lab2.phase2.repository.StudentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<StudentDTO> getStudentsByMajor(String major) {
        return studentRepository.getStudentsByMajor(major)
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<StudentDTO> findAll() {
        return studentRepository.findAll()
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public void createStudent(StudentDTO studentDTO) {
        studentRepository.create(toEntity(studentDTO));
    }

    @Override
    public void updateStudent(StudentDTO studentDTO) {
        studentRepository.updateStudent(toEntity(studentDTO));
    }

    @Override
    public void deleteStudent(int id) {
        studentRepository.deleteStudent(id);
    }

    //model wrapper starts here
    public StudentDTO toDTO(Student student) {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setFirstName(student.getFirstName());
        studentDTO.setLastName(student.getLastName());
        studentDTO.setMajor(student.getMajor());
        studentDTO.setGpa(student.getGpa());
        return studentDTO;
    }

    public Student toEntity(StudentDTO studentDTO) {
        Student student = new Student();
        student.setFirstName(studentDTO.getFirstName());
        student.setLastName(studentDTO.getLastName());
        student.setMajor(studentDTO.getMajor());
        student.setGpa(studentDTO.getGpa());
        return student;
    }
}
