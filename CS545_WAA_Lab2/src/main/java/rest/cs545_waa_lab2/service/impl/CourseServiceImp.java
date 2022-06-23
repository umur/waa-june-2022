package rest.cs545_waa_lab2.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import rest.cs545_waa_lab2.entity.Course;
import rest.cs545_waa_lab2.entity.Student;
import rest.cs545_waa_lab2.repository.CourseRepo;
import rest.cs545_waa_lab2.repository.StudentRepo;
import rest.cs545_waa_lab2.service.CourseService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CourseServiceImp implements CourseService {

    private final StudentRepo stdRepo;

    @Override
    public List<Course> getCoursesByStudentId(int studentId) {
     return    stdRepo.findAllStudents().stream()
                .filter(s -> s.getId() == studentId)
                .flatMap(course -> course.getCourses().stream())
                .collect(Collectors.toList());

    }

    @Override
    public Course addCourse(Course c) {

        return null;
    }

}
