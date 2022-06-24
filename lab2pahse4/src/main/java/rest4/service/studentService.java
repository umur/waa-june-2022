package rest4.service;

import rest4.DTO.courseDto;
import rest4.DTO.studentDto;

import java.util.List;

public interface studentService {
    void delete(int id);
    void save(studentDto s);
    List<studentDto> getAll();
    studentDto getById(int id);
    List<courseDto> getCourseByStudent(int id);

}
