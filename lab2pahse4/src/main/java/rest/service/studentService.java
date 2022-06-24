package rest.service;

import rest.DTO.courseDto;
import rest.DTO.studentDto;
import rest.entity.Student;
import rest.entity.course;

import java.util.List;

public interface studentService {
    void delete(int id);
    void save(studentDto s);
    List<studentDto> getAll();
    studentDto getById(int id);
    List<courseDto> getCourseByStudent(int id);

}
