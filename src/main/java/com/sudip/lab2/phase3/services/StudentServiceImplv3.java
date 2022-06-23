package com.sudip.lab2.phase3.services;

import com.sudip.lab2.phase3.dto.CourseDTO;
import com.sudip.lab2.phase3.dto.StudentDTO;
import com.sudip.lab2.phase3.entity.Course;
import com.sudip.lab2.phase3.entity.Student;
import com.sudip.lab2.phase3.repository.StudentRepositoryv3;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImplv3 implements StudentServicev3 {

    private final StudentRepositoryv3 studentRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public StudentServiceImplv3(StudentRepositoryv3 studentRepository, ModelMapper modelMapper) {
        this.studentRepository = studentRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<StudentDTO> findAll() {
        List<Student> studentList = studentRepository.findAll();
        return getStudentDTOS(studentList);
    }

    @Override
    public void create(StudentDTO studentDTO) {
        studentRepository.create(modelMapper.map(studentDTO, Student.class));
    }

    @Override
    public void update(StudentDTO studentDTO, int id) {
        studentRepository.update(modelMapper.map(studentDTO, Student.class), id);
    }

    @Override
    public void remove(int id) {
        studentRepository.remove(id);
    }

    @Override
    public List<StudentDTO> getStudentsByMajor(String major) {
        List<Student> studentList = studentRepository.getStudentsByMajor(major);
        return getStudentDTOS(studentList);

    }

    private List<StudentDTO> getStudentDTOS(List<Student> studentList) {
        List<StudentDTO> studentDTOS = new ArrayList<>();
        studentList.forEach(student -> {
            StudentDTO studentDTO1 = modelMapper.map(student, StudentDTO.class);
            studentDTOS.add(studentDTO1);
        });
        return studentDTOS;
    }

    @Override
    public List<CourseDTO> getCoursesByStudentId(int studentId) {
        List<Course> courseList = studentRepository.getCoursesByStudentId(studentId);
        List<CourseDTO> courseDTOList = new ArrayList<>();
        for (Course course : courseList) {

            CourseDTO courseDTO1 = modelMapper.map(course, CourseDTO.class);
            courseDTOList.add(courseDTO1);
        }
        return courseDTOList;

    }
}
