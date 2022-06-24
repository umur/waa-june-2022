package rest.cs545_waa_lab2_modelmapper.service.impl;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rest.cs545_waa_lab2_modelmapper.dto.CourseDto;
import rest.cs545_waa_lab2_modelmapper.dto.StudentDto;
import rest.cs545_waa_lab2_modelmapper.entity.Student;
import rest.cs545_waa_lab2_modelmapper.repository.StudentRepo;
import rest.cs545_waa_lab2_modelmapper.service.StudentService;


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
        var result = new ArrayList<StudentDto>();
        for (Student s: studentRepo.findAllStudents()){
            if (s.getMajor().equalsIgnoreCase(major)){
                result.add( modelMapper.map(s,StudentDto.class));
            }
        }
        return result;
    }


//    public List<StudentDto> getStudentByMajor(String major) {
//        List<Student> stds = studentRepo.findAllStudents();
//        var result = new ArrayList<StudentDto>();
//        stds.stream().filter(map->map.getMajor()==major).map(studentEntity->{
//            var dto = modelMapper.map(studentEntity,StudentDto.class);
//            result.add(dto);
//            return result;
//        });
//        return null;
//    }
//    @Override
//    public List<Student> getStudentByMajor(String major) {
//        List<Student> students = new ArrayList<>();
//        var result = new ArrayList<CourseDto>();
//        for (Student std :studentRepo.findAllStudents()){
//            if (std.getMajor().equalsIgnoreCase(major)){
//                students.add(std);
//            }
//        }
//
//        return students;
//    }

//    @Override
//    public List<Student> getStudentByMajor(String major) {
//        return studentRepo.findAllStudents().stream()
//                .filter(student -> student.getMajor()==major)
//                .collect(Collectors.toList());
//    }
}
