package edu.miu.phase3.services.impl;

import edu.miu.phase3.dto.CourseDto;
import edu.miu.phase3.entity.Course;
import edu.miu.phase3.repository.CourseRepo3;
import edu.miu.phase3.services.CourseServices3;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CourseServicesImpl3 implements CourseServices3 {

    private final CourseRepo3 courseRepo;

    @Autowired
    private final ModelMapper modelMapper;

    @Override
    public List<CourseDto> getCourses() {
        return courseRepo.getCourses().stream()
                .map(c -> modelMapper.map(c, CourseDto.class)).toList();
    }

    @Override
    public void updateCourse(CourseDto course, int id) {
        courseRepo.updateCourse(modelMapper.map(course, Course.class), id);
    }

    @Override
    public void addCourse(CourseDto course) {
        this.courseRepo.addCourse(this.modelMapper.map(course, Course.class));
    }

    @Override
    public void deleteCourse(int id) {
        this.courseRepo.deleteCourse(id);
    }

}
