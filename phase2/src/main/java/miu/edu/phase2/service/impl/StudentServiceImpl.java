package miu.edu.phase2.service.impl;

import miu.edu.phase2.dto.CourseDto;
import miu.edu.phase2.dto.StudentDto;
import miu.edu.phase2.repo.StudentRepo;
import miu.edu.phase2.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {
//    @Autowired
    private final StudentRepo studentRepo;

    public StudentServiceImpl(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public List<StudentDto> findAll() {
        return studentRepo.findAll();
    }

    @Override
    public StudentDto findOne(int id) {
        return studentRepo.findOne(id);
    }

    @Override
    public StudentDto create(StudentDto student) {
        return studentRepo.create(student);
    }

    @Override
    public StudentDto update(StudentDto student, int id) {
        return studentRepo.update(student,id);
    }

    @Override
    public void delete(int id) {
        studentRepo.delete(id);
    }

    @Override
    public List<StudentDto> getStudentsByMajor(String major) {
        return studentRepo.findAll().stream().filter(stu -> stu.getMajor().equals(major)).collect(Collectors.toList());
    }

    @Override
    public List<CourseDto> getCoursesByStudentId(int id) {
        return studentRepo.findOne(id).getCoursesTaken();
    }
}
