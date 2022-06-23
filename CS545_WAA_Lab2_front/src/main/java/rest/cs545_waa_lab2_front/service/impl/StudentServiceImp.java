package rest.cs545_waa_lab2_front.service.impl;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rest.cs545_waa_lab2_front.dto.StudentDto;
import rest.cs545_waa_lab2_front.entity.Student;
import rest.cs545_waa_lab2_front.repository.StudentRepo;
import rest.cs545_waa_lab2_front.service.StudentService;



import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImp  implements StudentService {
@Autowired
    private final StudentRepo studentRepo;
@Autowired
private final ModelMapper modelMapper;

    @Override
    public List<StudentDto> getStudentByMajor(String major) {
       List<StudentDto> students = new ArrayList<>();
       for (Student std :studentRepo.findAllStudents()){
           if (std.getMajor().equalsIgnoreCase(major)){
               students.add(modelMapper.map(std,StudentDto.class));
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
