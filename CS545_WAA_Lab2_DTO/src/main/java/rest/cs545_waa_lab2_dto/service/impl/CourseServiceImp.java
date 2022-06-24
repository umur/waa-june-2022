package rest.cs545_waa_lab2_dto.service.impl;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import rest.cs545_waa_lab2_dto.dto.CourseDto;
import rest.cs545_waa_lab2_dto.entity.Course;
import rest.cs545_waa_lab2_dto.entity.Student;
import rest.cs545_waa_lab2_dto.repository.CourseRepo;
import rest.cs545_waa_lab2_dto.repository.StudentRepo;
import rest.cs545_waa_lab2_dto.service.CourseService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CourseServiceImp implements CourseService {

    private final StudentRepo stdRepo;
    private final CourseRepo courseRepo;

    @Override
    public List<CourseDto> getCoursesByStudentId(int studentId) {
      List<Student> stds = stdRepo.findAllStudents();
        return stds.stream()
                .filter(student -> student.getId()== studentId)
                .flatMap(course->course.getCourses().stream()).map(dto->
                        new CourseDto(dto.getId(),dto.getCourseName(),dto.getCode()))
                .collect(Collectors.toList());

    }

    @Override
    public List<CourseDto> getAllCourses() {
        List<Course> courses =courseRepo.findAllCourses();
        return courses.stream().map(course ->
                new CourseDto(course.getId(),course.getCourseName(),course.getCode()))
                .collect(Collectors.toList());
    }

}
