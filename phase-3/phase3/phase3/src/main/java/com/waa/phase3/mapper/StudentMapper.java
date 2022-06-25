package com.waa.phase3.mapper;

import com.waa.phase3.dto.StudentDTO;
import com.waa.phase3.entity.Student;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentMapper {

    private final ModelMapper modelMapper;

    public StudentDTO toDTO(Student student) {
        return modelMapper.map(student, StudentDTO.class);
    }

    public Student toStudent(StudentDTO dto) {
        return modelMapper.map(dto, Student.class);
    }
}
