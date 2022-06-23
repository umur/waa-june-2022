package rest.cs545_waa_lab2_frontend.service.impl;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rest.cs545_waa_lab2_frontend.dto.StudentDto;
import rest.cs545_waa_lab2_frontend.entity.Student;
import rest.cs545_waa_lab2_frontend.repository.StudentRepo;
import rest.cs545_waa_lab2_frontend.service.StudentService;


import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImp  implements StudentService {
@Autowired
    private final StudentRepo studentRepo;
@Autowired
private final ModelMapper modelMapper;

    private StudentDto convertEntityToDto(Student std){
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        StudentDto studentDto= new StudentDto();
        studentDto=modelMapper.map(std, StudentDto.class);
        return studentDto;
    }

    private Student convertDtoToEntity(StudentDto stdDto){
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        Student student= new Student();
        student=modelMapper.map(stdDto, Student.class);
        return student;
    }
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
