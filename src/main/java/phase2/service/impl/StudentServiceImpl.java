package phase2.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import phase2.dto.CourseDTO;
import phase2.dto.StudentDTO;
import phase2.repo.StudentRepository;
import phase2.service.StudentService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;


    @Override
    public Integer create(StudentDTO studentDTO) {
        return studentRepository.save(StudentDTO.toStudent(studentDTO));
    }

    @Override
    public List<StudentDTO> getStudentsByMajor(String major) {
        return studentRepository.getStudentsByMajor(major)
                .stream()
                .map(student -> StudentDTO.toDTO(student))
                .toList();
    }

    @Override
    public List<CourseDTO> getCoursesByStudentId(Integer id) {
        return studentRepository.findCoursesByStudentId(id).stream().map(CourseDTO::toDTO).toList();
    }
}
