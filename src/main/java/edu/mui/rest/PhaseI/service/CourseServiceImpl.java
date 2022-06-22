package edu.mui.rest.PhaseI.service;

import edu.mui.rest.PhaseI.entity.Course;
import edu.mui.rest.PhaseI.repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepo courseRepo;

    @Override
    public List<Course> findAll() {
        var courses = courseRepo.findAll();
//        var result = new ArrayList<CourseDto>();
//
//        for(Course course: courses){
//            CourseDto dto = new CourseDto();
//            var courseDto =dto.toDto(course);
//            result.add(courseDto);
//        }

        return courses;
    }
}
