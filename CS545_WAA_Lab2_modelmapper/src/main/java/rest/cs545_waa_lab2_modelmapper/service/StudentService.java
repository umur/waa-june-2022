package rest.cs545_waa_lab2_modelmapper.service;

import rest.cs545_waa_lab2_modelmapper.dto.StudentDto;
import rest.cs545_waa_lab2_modelmapper.entity.Student;

import java.util.List;

public interface StudentService {
    public List<StudentDto> getStudentByMajor(String major);
}
