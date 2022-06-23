package edu.miu.lab2.phase3.service.courseservice;


import edu.miu.lab2.phase3.dto.CourseDtoP3;
import edu.miu.lab2.phase3.entity.Course;
import edu.miu.lab2.phase3.repo.CourseRepoP3;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CourseServiceImplP3 implements CourseService {

    private final CourseRepoP3 courseRepo;
    private final ModelMapper modelMapper;

    @Override
    public List<CourseDtoP3> getCourseDto() {
//        var courses = courseRepo.findCourse();
//        var result = new ArrayList<CourseDtoP3>();
//        for (Course course : courses) {
//            CourseDtoP3 dto = new CourseDtoP3();
//            var courseDto = modelMapper.map(course, CourseDtoP3.class);
//            result.add(courseDto);
//        }
//        return result;
        return courseRepo.findCourse().stream().map(course ->modelMapper.map(course,CourseDtoP3.class)).toList();

    }

    @Override
    public void createCourse(CourseDtoP3 courseDto) {
        //courseRepo.createCourse(courseDto.toEntity());
        courseRepo.createCourse(modelMapper.map(courseDto, Course.class));

    }

    @Override
    public void deleteCourse(int id) {
        courseRepo.deleteCourse(id);
    }

    @Override
    public void updateCourse(CourseDtoP3 c, int id) {
        //courseRepo.updateCourse(c.toEntity(),id);
        courseRepo.updateCourse(modelMapper.map(c, Course.class), id);



    }

}
