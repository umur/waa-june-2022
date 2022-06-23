package com.sudip.lab2.phase2.services;

import com.sudip.lab2.phase2.dto.CourseDTO;
import com.sudip.lab2.phase2.dto.StudentDTO;
import com.sudip.lab2.phase2.entity.Course;
import com.sudip.lab2.phase2.entity.Student;
import com.sudip.lab2.phase2.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImplv2 implements StudentServicev2 {

    StudentRepository studentRepository;

    @Autowired
    public StudentServiceImplv2(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<StudentDTO> findAll() {
        List<Student> studentList = studentRepository.findAll();
        return getStudentDTOS(studentList);
    }

    @Override
    public void create(StudentDTO studentDTO) {
        Student student = studentDTO.toStudentEntity();
        studentRepository.create(student);
    }

    @Override
    public void update(StudentDTO studentDTO, int id) {
        Student student = studentDTO.toStudentEntity();
        studentRepository.update(student, id);
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
        StudentDTO studentDTO = new StudentDTO();
        List<StudentDTO> studentDTOS = new ArrayList<>();
        studentList.forEach(student -> {
            StudentDTO studentDTO1 = studentDTO.toStudentDto(student);
            studentDTOS.add(studentDTO1);
        });
        return studentDTOS;
    }

    @Override
    public List<CourseDTO> getCoursesByStudentId(int studentId) {
        List<Course> courseList = studentRepository.getCoursesByStudentId(studentId);
        List<CourseDTO> courseDTOList = new ArrayList<>();
        CourseDTO courseDTO = new CourseDTO();
        for (Course course : courseList) {
            CourseDTO courseDTO1 = courseDTO.courseDTO(course);
            courseDTOList.add(courseDTO1);
        }
        return courseDTOList;

    }
}
