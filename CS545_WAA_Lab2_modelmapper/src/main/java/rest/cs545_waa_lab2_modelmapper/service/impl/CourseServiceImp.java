package rest.cs545_waa_lab2_modelmapper.service.impl;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rest.cs545_waa_lab2_modelmapper.dto.CourseDto;
import rest.cs545_waa_lab2_modelmapper.entity.Course;
import rest.cs545_waa_lab2_modelmapper.entity.Student;
import rest.cs545_waa_lab2_modelmapper.repository.CourseRepo;
import rest.cs545_waa_lab2_modelmapper.repository.StudentRepo;
import rest.cs545_waa_lab2_modelmapper.service.CourseService;


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
        List<CourseDto> courseDto = new ArrayList<>();
        for (Student student : stdRepo.findAllStudents()) {
            if (student.getId() == studentId) {// id student
                for (Course course : student.getCourses()) {// find all courses
                    var dto = modelMapper.map(course, CourseDto.class);
                    courseDto.add(dto);
                }
            }
        }
            return courseDto;
        }

    @Override
    public List<CourseDto> getAllCourses() {
        List<Course> courses =courseRepo.findAllCourses();
        var result = new ArrayList<>();
        return (List<CourseDto>) courses.stream().map(courseEntity -> {
            var dto = modelMapper.map(courseEntity,CourseDto.class);
            result.add(dto);
            return result;
        });


//    private  CourseDto convertEntityToDto(Course course){
////        modelMapper.getConfiguration()
////                .setMatchingStrategy(MatchingStrategies.LOOSE);
//        //CourseDto courseDto= new CourseDto();
//        //courseDto=modelMapper.map(course, CourseDto.class);
//        var data : course = courseRepo.findAllCourses();
//        var result:modelMapper.map(course,c);
//        return result;
//    }
//    private  Course convertDtoToEntity(CourseDto courseDto){
//        modelMapper.getConfiguration()
//                .setMatchingStrategy(MatchingStrategies.LOOSE);
//        Course course= new Course();
//        course=modelMapper.map(courseDto, Course.class);
//        return course;
//    }

//    @Override
//    public List<CourseDto> getCoursesByStudentId(int studentId) {
//      List<Student> stds = stdRepo.findAllStudents();
//      var result = new ArrayList<CourseDto>();
//        return (List<CourseDto>) stds.stream()
//                .filter(student -> student.getId()== studentId)
//                .map(std->std.getCourses()).map(courseEntity->{
//                    var dto = modelMapper.map(courseEntity,CourseDto.class);
//                    result.add(dto);
//                    return result;
//                });
//    }

     //course ->
                //new CourseDto(course.getId(),course.getCourseName(),course.getCode()))
               // .collect(Collectors.toList());
    }

}
