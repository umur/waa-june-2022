package miu.edu.phase3.service.impl;

import lombok.AllArgsConstructor;
import miu.edu.phase3.dto.CourseDto;
import miu.edu.phase3.dto.StudentDto;
import miu.edu.phase3.entity.Student;
import miu.edu.phase3.repo.StudentRepo;
import miu.edu.phase3.service.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
//    @Autowired
    private final StudentRepo studentRepo;
    private final ModelMapper mapper;


    @Override
    public List<StudentDto> findAll() {
        return studentRepo.findAll().stream()
                .map(student -> mapper.map(student, StudentDto.class))
                .toList();
    }

    @Override
    public StudentDto findOne(int id) {
        return mapper.map(studentRepo.findOne(id), StudentDto.class);
    }

    @Override
    public StudentDto create(StudentDto student) {
        return mapper.map(studentRepo.create(mapper.map(student, Student.class)), StudentDto.class);
    }

    @Override
    public StudentDto update(StudentDto student, int id) {
        return mapper.map(studentRepo.update(mapper.map(student, Student.class),id), StudentDto.class);
    }

    @Override
    public void delete(int id) {
        studentRepo.delete(id);
    }

    @Override
    public List<StudentDto> getStudentsByMajor(String major) {
        var students = studentRepo.findAll().stream().filter(stu -> stu.getMajor().equals(major));
        return students.map(student -> mapper.map(student, StudentDto.class)).toList();
    }

    @Override
    public List<CourseDto> getCoursesByStudentId(int id) {
//        return mapper.map(studentRepo.findOne(id).getCoursesTaken(), CourseDto.class);
        return null;
    }
}
