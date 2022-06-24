package miu.edu.lab1phase4.service.impl;

import lombok.AllArgsConstructor;
import miu.edu.lab1phase4.dto.StudentDto;
import miu.edu.lab1phase4.entity.Course;
import miu.edu.lab1phase4.entity.Student;
import miu.edu.lab1phase4.repo.StudentRepo;
import miu.edu.lab1phase4.service.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
    @Autowired
    private final StudentRepo studentRepo;
    private ModelMapper mapper;
    @Override
    public List<StudentDto> findAll() {
        var students =  studentRepo.findAll();
        var result = new ArrayList<StudentDto>();

        for(Student student: students){
            StudentDto stu = new StudentDto();
            StudentDto student1  = toDto(student);
            result.add(student1);
        }
        return result;
    }
    @Override
    public void create(StudentDto s) {
        Student student = toEntity(s);
        studentRepo.create(student);

    }

    @Override
    public void delete(int id) {
        studentRepo.delete(id);
    }

    @Override
    public void update(int id, StudentDto s) {
        Student student = toEntity(s);
        studentRepo.update(id, student);
    }

    @Override
    public List<Student> getStudentsByMajor(String major) {
        return studentRepo.findAll().stream().filter(student -> student.getMajor().equals(major)).collect(Collectors.toList());
    }

    @Override
    public List<Course> getCoursesByStudentId(int id) {

        return studentRepo.findById(id).getCourseTaken();
    }

    public StudentDto toDto(Student student){
        StudentDto studentDto = mapper.map(student, StudentDto.class);
        return studentDto;
    }

    public Student toEntity(StudentDto studentDto){
        Student student = mapper.map(studentDto, Student.class);
        return student;
    }
}
