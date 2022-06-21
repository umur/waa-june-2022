package miu.edu.phasei.service.impl;

import miu.edu.phasei.entity.Course;
import miu.edu.phasei.entity.Student;
import miu.edu.phasei.repo.StudentRepo;
import miu.edu.phasei.service.StudentService;
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
    public List<Student> findAll() {
        return studentRepo.findAll();
    }

    @Override
    public Student findOne(int id) {
        return studentRepo.findOne(id);
    }

    @Override
    public Student create(Student student) {
        return studentRepo.create(student);
    }

    @Override
    public Student update(Student student, int id) {
        return studentRepo.update(student,id);
    }

    @Override
    public void delete(int id) {
        studentRepo.delete(id);
    }

    @Override
    public List<Student> getStudentsByMajor(String major) {
        return studentRepo.findAll().stream().filter(stu -> stu.getMajor().equals(major)).collect(Collectors.toList());
    }

    @Override
    public List<Course> getCoursesByStudentId(int id) {
        return studentRepo.findOne(id).getCoursesTaken();
    }
}
