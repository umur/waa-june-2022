package phase3.service.impl;


import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import phase3.dto.CourseDTO;
import phase3.dto.StudentDTO;
import phase3.entity.Student;
import phase3.repo.StudentRepository;
import phase3.service.StudentService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper=new ModelMapper();

    @Override
    public Integer create(StudentDTO studentDTO) {
        return studentRepository.save(modelMapper.map(studentDTO, Student.class));
    }

    @Override
    public List<StudentDTO> getStudentsByMajor(String major) {
        return studentRepository.getStudentsByMajor(major).stream().map(student -> modelMapper.map(student,StudentDTO.class)).toList();
    }

    @Override
    public List<CourseDTO> getCoursesByStudentId(Integer id) {
        return studentRepository.findCoursesByStudentId(id).stream().map(course -> modelMapper.map(course,CourseDTO.class)).toList();
    }
}
