package com.sudip.lab2.phase4.services;

import com.sudip.lab2.phase4.dto.CourseDTOv4;
import com.sudip.lab2.phase4.dto.StudentDTOv4;
import com.sudip.lab2.phase4.entity.Course;
import com.sudip.lab2.phase4.entity.Student;
import com.sudip.lab2.phase4.repository.StudentRepositoryv4;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServicev4Impl implements StudentServicev4 {

    private final StudentRepositoryv4 studentRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public StudentServicev4Impl(StudentRepositoryv4 studentRepository, ModelMapper modelMapper) {
        this.studentRepository = studentRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<StudentDTOv4> findAll() {
        List<Student> studentList = studentRepository.findAll();
        return getStudentDTOS(studentList);
    }

    @Override
    public void create(StudentDTOv4 studentDTO) {
        studentRepository.create(modelMapper.map(studentDTO, Student.class));
    }

    @Override
    public void update(StudentDTOv4 studentDTO, int id) {
        studentRepository.update(modelMapper.map(studentDTO, Student.class), id);
    }

    @Override
    public void remove(int id) {
        studentRepository.remove(id);
    }

    @Override
    public List<StudentDTOv4> getStudentsByMajor(String major) {
        List<Student> studentList = studentRepository.getStudentsByMajor(major);
        return getStudentDTOS(studentList);

    }

    private List<StudentDTOv4> getStudentDTOS(List<Student> studentList) {
        List<StudentDTOv4> studentDTOS = new ArrayList<>();
        studentList.forEach(student -> {
            StudentDTOv4 studentDTO1 = modelMapper.map(student, StudentDTOv4.class);
            studentDTOS.add(studentDTO1);
        });
        return studentDTOS;
    }

    @Override
    public List<CourseDTOv4> getCoursesByStudentId(int studentId) {
        List<Course> courseList = studentRepository.getCoursesByStudentId(studentId);
        List<CourseDTOv4> courseDTOList = new ArrayList<>();
        for (Course course : courseList) {

            CourseDTOv4 courseDTO1 = modelMapper.map(course, CourseDTOv4.class);
            courseDTOList.add(courseDTO1);
        }
        return courseDTOList;

    }
}
