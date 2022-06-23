package edu.miu.cs545.phaseIII.service.impl;

import edu.miu.cs545.phaseIII.dto.StudentDto;
import edu.miu.cs545.phaseIII.entity.Course;
import edu.miu.cs545.phaseIII.repository.StudentRepository;
import edu.miu.cs545.phaseIII.service.StudentService;
import edu.miu.cs545.phaseIII.utils.StudentUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    @Override
    public List<StudentDto> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public StudentDto createNewStudent(StudentDto studentDto) {
        return studentRepository.create(StudentUtils.parseStudentDtoToStudent(studentDto));
    }

    @Override
    public StudentDto updateStudent(StudentDto studentDto, int id) {
        return studentRepository.update(id, StudentUtils.parseStudentDtoToStudent(studentDto));
    }

    @Override
    public StudentDto deleteStudent(int id) {
        return studentRepository.delete(id);
    }

    @Override
    public List<StudentDto> getStudentsByMajor(String major) {
        return studentRepository.getStudentsByMajor(major);
    }

    @Override
    public List<Course> getCoursesByStudentId(int id) {
        return studentRepository.getCourseByStudentId(id);
    }
}
