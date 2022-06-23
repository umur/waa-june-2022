package rest.cs545_waa_lab2.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import rest.cs545_waa_lab2.entity.Course;
import rest.cs545_waa_lab2.entity.Student;
import rest.cs545_waa_lab2.repository.StudentRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class StudentServiceImp  implements StudentService{

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
