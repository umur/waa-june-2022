package edu.miu.rest.service.impl;

import edu.miu.rest.dto.CourseDto;
import edu.miu.rest.dto.StudentDto;
import edu.miu.rest.entity.Course;
import edu.miu.rest.entity.Student;
import edu.miu.rest.repository.StudentRepo;
import edu.miu.rest.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepo studentRepo;

    @Override
    public List<StudentDto> findAll() {
        var students = studentRepo.findAll();
        var result = new ArrayList<StudentDto>();

        for(Student student : students)
        {
            StudentDto s = new StudentDto();
            var studentDto = s.toDto(student);
            result.add(studentDto);
        }
        return result;
    }

    @Override
    public void create(StudentDto studentDto) {
        Student student = studentDto.toEntity();
        studentRepo.createStudent(student);
    }

    @Override
    public void update(StudentDto studentDto) {
        Student student = studentDto.toEntity();
        studentRepo.updateStudent(student);

    }

    @Override
    public void delete(StudentDto studentDto) {
        Student student = studentDto.toEntity();
        studentRepo.deleteStudent(student);  }

    @Override
    public List<StudentDto> getStudentsByMajor(String major) {
        List<Student> students = studentRepo.getStudentsByMajor(major);
        var result = new ArrayList<StudentDto>();
        for(Student student : students)
        {
            StudentDto dto = new StudentDto();
            var stu = dto.toDto(student);
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
            CourseDto dto = new CourseDto();
            var c = dto.toDto(course);
            result.add(c);
        }
        return result;
    }
}
