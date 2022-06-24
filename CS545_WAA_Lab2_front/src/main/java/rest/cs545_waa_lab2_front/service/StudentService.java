package rest.cs545_waa_lab2_front.service;



import rest.cs545_waa_lab2_front.dto.StudentDto;
import rest.cs545_waa_lab2_front.entity.Student;

import java.util.List;

public interface StudentService {
    public List<StudentDto> getStudentByMajor(String major);
}
