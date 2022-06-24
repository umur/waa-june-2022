package miu.edu.restdto.lab1phase2.service.impl;

import lombok.AllArgsConstructor;
import miu.edu.restdto.lab1phase2.dto.StudentDto;
import miu.edu.restdto.lab1phase2.entity.Course;
import miu.edu.restdto.lab1phase2.entity.Student;
import miu.edu.restdto.lab1phase2.repo.StudentRepo;
import miu.edu.restdto.lab1phase2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
    @Autowired
    private final StudentRepo studentRepo;

    @Override
    public List<StudentDto> findAll() {
        var students =  studentRepo.findAll();
        var result = new ArrayList<StudentDto>();

        for(Student student: students){
            StudentDto stu = new StudentDto();
            StudentDto student1  = stu.toDto(student);
            result.add(student1);
        }
        return result;
    }
    @Override
    public void create(StudentDto s) {
        Student student = s.toEntity();
        studentRepo.create(student);

    }

    @Override
    public void delete(int id) {
//        studentRepo.delete(studentRepo.findAll().stream().filter(x -> x.getId() != id).toList());
//        studentRepo.findAll().stream().filter(x->x.getId() != id);
        studentRepo.delete(id);
    }

    @Override
    public void update(int id, StudentDto s) {
        Student student = s.toEntity();
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
}
