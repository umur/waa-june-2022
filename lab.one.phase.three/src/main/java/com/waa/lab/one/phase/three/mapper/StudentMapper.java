package com.waa.lab.one.phase.three.mapper;

import com.waa.lab.one.phase.three.dto.StudentDTO;
import com.waa.lab.one.phase.three.entiry.Student;
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
