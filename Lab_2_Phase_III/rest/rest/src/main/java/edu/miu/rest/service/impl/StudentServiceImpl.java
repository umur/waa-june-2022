package edu.miu.rest.service.impl;

import edu.miu.rest.dto.CourseDto;
import edu.miu.rest.dto.StudentDto;
import edu.miu.rest.entity.Course;
import edu.miu.rest.entity.Student;
import edu.miu.rest.repository.StudentRepo;
import edu.miu.rest.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor

public class StudentServiceImpl implements StudentService {

    private final StudentRepo studentRepo;
    private final ModelMapper modelMapper = new ModelMapper() ;

    @Override
    public List<StudentDto> findAll() {
        var students = studentRepo.findAll();
        var result = new ArrayList<StudentDto>();

        for(Student student : students)
        {
            StudentDto s = new StudentDto();
            var studentDto = modelMapper.map(student , StudentDto.class);
            result.add(studentDto);
        }
        return result;
    }

    @Override
    public void create(StudentDto studentDto) {
        Student student = modelMapper.map(studentDto , Student.class);
        studentRepo.createStudent(student);
    }

    @Override
    public void update(StudentDto studentDto) {
        Student student = modelMapper.map(studentDto , Student.class);
        studentRepo.updateStudent(student);

    }

    @Override
    public void delete(StudentDto studentDto) {
        Student student = modelMapper.map(studentDto , Student.class);
        studentRepo.deleteStudent(student);  }

    @Override
    public List<StudentDto> getStudentsByMajor(String major) {
        List<Student> students = studentRepo.getStudentsByMajor(major);
        var result = new ArrayList<StudentDto>();
        for(Student student : students)
        {

            var stu = modelMapper.map(student , StudentDto.class);
            result.add(stu);
        }
        return result;
    }
    @Override
    public List<CourseDto> getCoursesByStudentId(int studentId)
    {
        List<Course> courseList = studentRepo.getCoursesByStudentId(studentId);
        var result = new ArrayList<CourseDto>();
        for(Course course : courseList)
        {

            var c = modelMapper.map( course , CourseDto.class);
            result.add(c);
        }
        return result;
    }
}
