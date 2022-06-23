package rest.cs545_waa_lab2_dto.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import rest.cs545_waa_lab2_dto.entity.Student;
import rest.cs545_waa_lab2_dto.repository.StudentRepo;
import rest.cs545_waa_lab2_dto.service.StudentService;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImp  implements StudentService {

    private final StudentRepo studentRepo;

    @Override
    public List<Student> getStudentByMajor(String major) {
       List<Student> students = new ArrayList<>();
       for (Student std :studentRepo.findAllStudents()){
           if (std.getMajor().equalsIgnoreCase(major)){
               students.add(std);
           }
       }

        return students;
    }

//    @Override
//    public List<Student> getStudentByMajor(String major) {
//        return studentRepo.findAllStudents().stream()
//                .filter(student -> student.getMajor()==major)
//                .collect(Collectors.toList());
//    }
}
