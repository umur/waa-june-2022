package edu.miu.phase3.services.impl;

import edu.miu.phase3.dto.CourseDto;
import edu.miu.phase3.dto.StudentDTO;
import edu.miu.phase3.entity.Student;
import edu.miu.phase3.repository.StudentRepo3;
import edu.miu.phase3.services.StudentServices3;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentServicesImpl3 implements StudentServices3 {

    private final StudentRepo3 studentRepo;

    @Autowired
    private final ModelMapper modelMapper;

    @Override
    public List<StudentDTO> getStudents() {
        return this.studentRepo.getStudents().stream()
                .map(s -> this.modelMapper.map(s, StudentDTO.class)).toList();
    }

    @Override
    public void addStudent(StudentDTO student) {
        this.studentRepo.addStudent(this.modelMapper.map(student, Student.class));
    }

    @Override
    public void updateStudent(StudentDTO student, int id) {
        this.studentRepo.updateStudent(this.modelMapper.map(student, Student.class), id);
    }

    @Override
    public void deleteStudent(int id) {
        this.studentRepo.deleteStudent(id);
    }

    @Override
    public StudentDTO getStudentsByMajor(String major) {
        return modelMapper.map(studentRepo.getStudentsByMajor(major), StudentDTO.class);
    }

    @Override
    public List<CourseDto> getCoursesByStudentId(int id) {
        return this.studentRepo.getCoursesByStudentId(id).stream().map(s -> modelMapper.map(s, CourseDto.class)).toList();
    }
}
