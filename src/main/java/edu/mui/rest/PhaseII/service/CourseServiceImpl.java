package edu.mui.rest.PhaseII.service;

import edu.mui.rest.PhaseII.dto.CourseDto;
import edu.mui.rest.PhaseII.entity.Course;
import edu.mui.rest.PhaseII.repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CourseServiceImpl implements CourseService{
    @Autowired
    private CourseRepo courseRepo;

    @Override
    public ArrayList<CourseDto> findAll() {
        var courses = courseRepo.findAll();
        var result = new ArrayList<CourseDto>();

        for(Course course: courses){
            CourseDto dto = new CourseDto();
            var courseDto =dto.toDto(course);
            result.add(courseDto);
        }

        return result;
    }
}
