package rest.cs545_waa_lab2_frontend.service;

import rest.cs545_waa_lab2_frontend.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getStudentByMajor(String major);
}
