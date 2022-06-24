package com.example.lab2.phase3.service;


import com.example.lab2.phase3.DTO.StudentDTO;
import com.example.lab2.phase3.entity.Student;
import com.example.lab2.phase3.repository.StudentRepository;
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
        return modelMapper.map(student, StudentDTO.class);
    }

    public Student toEntity(StudentDTO studentDTO) {
        return modelMapper.map(studentDTO, Student.class);
    }
}
