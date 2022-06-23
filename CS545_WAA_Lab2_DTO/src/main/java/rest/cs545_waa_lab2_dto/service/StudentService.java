package rest.cs545_waa_lab2.service;

import rest.cs545_waa_lab2.entity.Student;

import java.util.List;

public interface StudentService {


    public  List<Student> getStudentByMajor(String major);


}
