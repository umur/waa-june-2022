package edu.miu.phase2.services.impl;

import edu.miu.phase2.dto.CourseDto;
import edu.miu.phase2.dto.StudentDTO;
import edu.miu.phase2.repository.StudentRepo2;
import edu.miu.phase2.services.StudentServices2;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentServicesImpl2 implements StudentServices2 {

    private final StudentRepo2 studentRepo;

    @Override
    public List<StudentDTO> getStudents() {
       return this.studentRepo.getStudents().stream().map(s -> new StudentDTO().toDTO(s)).toList();
    }

    @Override
    public void addStudent(StudentDTO student) {
        this.studentRepo.addStudent(student.toEntity());
    }

    @Override
    public void updateStudent(StudentDTO student, int id) {
        this.studentRepo.updateStudent(student.toEntity(), id);
    }

    @Override
    public void deleteStudent(int id) {
       this.studentRepo.deleteStudent(id);
    }

    @Override
    public StudentDTO getStudentsByMajor(String major) {
        return new StudentDTO().toDTO(studentRepo.getStudentsByMajor(major));
    }
    @Override
    public List<CourseDto> getCoursesByStudentId(int id) {
        return this.studentRepo.getCoursesByStudentId(id).stream().map(s -> new CourseDto().toDto(s)).toList();
    }
}
