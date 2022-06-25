package phaseI.miu.cs545.course.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import phaseI.miu.cs545.course.entity.CourseDto;
import phaseI.miu.cs545.course.entity.StudentDto;
import phaseI.miu.cs545.course.repository.StudentRepository;
import phaseI.miu.cs545.course.service.StudentService;

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
    public void createNewStudent(StudentDto student) {
        studentRepository.create(student);
    }

    @Override
    public void updateStudent(StudentDto student, int id) {
        studentRepository.update(id, student);
    }

    @Override
    public void deleteStudent(int id) {
        studentRepository.delete(id);
    }

    @Override
    public List<StudentDto> getStudentsByMajor(String major) {
        return studentRepository.getStudentsByMajor(major);
    }

    @Override
    public List<CourseDto> getCoursesByStudentId(int id) {
        return studentRepository.getCourseByStudentId(id);
    }
}
