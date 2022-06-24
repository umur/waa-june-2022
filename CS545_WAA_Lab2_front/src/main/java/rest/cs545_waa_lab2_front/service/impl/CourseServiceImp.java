package rest.cs545_waa_lab2_front.service.impl;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rest.cs545_waa_lab2_front.dto.CourseDto;
import rest.cs545_waa_lab2_front.entity.Course;
import rest.cs545_waa_lab2_front.entity.Student;
import rest.cs545_waa_lab2_front.repository.CourseRepo;
import rest.cs545_waa_lab2_front.repository.StudentRepo;
import rest.cs545_waa_lab2_front.service.CourseService;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CourseServiceImp implements CourseService {

    private final StudentRepo stdRepo;
    private final CourseRepo courseRepo;
    @Autowired
    private final ModelMapper modelMapper;

    @Override
    public List<CourseDto> getCoursesByStudentId(int studentId) {

        List<CourseDto> courseDtos = new ArrayList<>();
        for (Student s:stdRepo.findAllStudents()){
            if (s.getId()==studentId){
               for (Course course: s.getCourses()){
                   courseDtos.add(modelMapper.map(course,CourseDto.class));
               }
            }
        }
return courseDtos;
    }

    @Override
    public List<CourseDto> getAllCourses() {
        List<Course> courses = courseRepo.findAllCourses();
        return courses.stream().map(course ->
                        new CourseDto(course.getId(), course.getCourseName(), course.getCode()))
                .collect(Collectors.toList());
    }
}




//        return stds.stream()
//                .filter(student -> student.getId()== studentId)
//                .map(student->student.getCourses().stream()).map(dto->{
//                            var result = modelMapper.map(dto, CourseDto.class)
//
//                            courseDtos.add(result);
//                    return courseDtos;
//                });
//        return null;
                        //stds.add(modelMapper.map(dto,CourseDto.class));






