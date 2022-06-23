package rest.cs545_waa_lab2_frontend.service.impl;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rest.cs545_waa_lab2_frontend.dto.CourseDto;
import rest.cs545_waa_lab2_frontend.dto.StudentDto;
import rest.cs545_waa_lab2_frontend.entity.Course;
import rest.cs545_waa_lab2_frontend.entity.Student;
import rest.cs545_waa_lab2_frontend.repository.CourseRepo;
import rest.cs545_waa_lab2_frontend.repository.StudentRepo;
import rest.cs545_waa_lab2_frontend.service.CourseService;


import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CourseServiceImp implements CourseService {

    private final StudentRepo stdRepo;
    private final CourseRepo courseRepo;
    @Autowired
    private final ModelMapper modelMapper;

    private  CourseDto convertEntityToDto(Course course){
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        CourseDto courseDto= new CourseDto();
        courseDto=modelMapper.map(course, CourseDto.class);
        return courseDto;
    }
    private  Course convertDtoToEntity(CourseDto courseDto){
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        Course course= new Course();
        course=modelMapper.map(courseDto, Course.class);
        return course;
    }

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
