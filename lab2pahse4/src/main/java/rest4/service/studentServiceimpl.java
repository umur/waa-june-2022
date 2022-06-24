package rest4.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rest4.DTO.courseDto;
import rest4.DTO.studentDto;
import rest4.entity.Student;
import rest4.entity.course;
import rest4.repository.StudentRepository;

import java.util.ArrayList;
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
    public void save(studentDto s) {
        Student stu=new Student();
        stu.setId(s.getId());
        stu.setFirstName(s.getFirstName());
       stu.setLastName(s.getAstName());
        stu.setEmail(s.getEmail());
        stu.setMajor(s.getMajor());
        stu.setGpa(s.getGpa());
       //stu.setCoursesTaken(s.getCoursesTaken());
       studentrepository.save(stu);
    }

    @Override
    public List<studentDto> getAll() {
        var s1= new ArrayList<studentDto>();
        var studentList=studentrepository.getAll();
        for(Student h:studentList){
            studentDto dto=new studentDto();
            dto.setId(h.getId());
            dto.setFirstName(h.getFirstName());
            s1.add(dto);
        }
        return s1;
    }

    @Override
    public studentDto getById(int id) {
        Student s = studentrepository.getById(id);
        studentDto studentDto=new studentDto();
        studentDto.setId(s.getId());
        studentDto.setFirstName(s.getFirstName());
        return studentDto;
    }
    @Override
    public List<courseDto> getCourseByStudent(int id) {
        var s1= new ArrayList<courseDto>();
        List<course>studentList=studentrepository.getCourseByStudent(id);

        for(course h:studentList){
            courseDto dto=new courseDto();
            dto.setId(h.getId());
            dto.setCode(h.getCode());
            s1.add(dto);
        }
        return s1;
       // return studentrepository.getCourseByStudent(id);
    }
}
