package miu.edu.lab1.service.impl;

import lombok.AllArgsConstructor;
import miu.edu.lab1.entity.Course;
import miu.edu.lab1.entity.Student;
import miu.edu.lab1.repo.StudentRepo;
import miu.edu.lab1.service.StudentService;
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
    public List<Student> findAll() {
        var students =  studentRepo.findAll();
        var result = new ArrayList<Student>();

        for(Student student: students){
//            student  = new Student();
            result.add(student);
        }
        return result;
    }
    @Override
    public void create(Student s) {
        studentRepo.create(s);

    }

    @Override
    public void delete(int id) {
//        studentRepo.delete(studentRepo.findAll().stream().filter(x -> x.getId() != id).toList());
//        studentRepo.findAll().stream().filter(x->x.getId() != id);
        studentRepo.delete(id);
    }

    @Override
    public void update(int id, Student s) {
        studentRepo.update(id, s);
//        studentRepo.findAll().stream().filter(x->x.getId() == id);


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
