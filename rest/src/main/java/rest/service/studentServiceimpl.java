package rest.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rest.entity.Student;
import rest.entity.course;
import rest.repository.StudentRepository;

import java.util.List;
@Service
@RequiredArgsConstructor
public class studentServiceimpl implements studentService{
    public final StudentRepository studentrepository;
    @Override
    public void delete(int id) {
        studentrepository.delete(id);
    }

    @Override
    public void save(Student s) {
       studentrepository.save(s);
    }

    @Override
    public List<Student> getAll() {
        return studentrepository.getAll();
    }

    @Override
    public Student getById(int id) {
        return studentrepository.getById(id);
    }

    @Override
    public List<course> getCourseByStudent(int id) {
        return studentrepository.getCourseByStudent(id);
    }
}
