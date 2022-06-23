package edu.miu.cs545.phaseIII.service.impl;

import edu.miu.cs545.phaseIII.dto.CourseDto;
import edu.miu.cs545.phaseIII.repository.CourseRepository;
import edu.miu.cs545.phaseIII.service.CourseService;
import edu.miu.cs545.phaseIII.utils.CourseUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {
    private final CourseRepository courseRepository;

    @Override
    public List<CourseDto> findAllCourses() {
        List<CourseDto> retCourseDtoList = new ArrayList<>();
        courseRepository.findAll().forEach((e)->retCourseDtoList.add(CourseUtils.parseCourseToCourseDto(e)));
        return retCourseDtoList;
    }

    @Override
    public CourseDto createNewCourse(CourseDto courseDto) {
        return courseRepository.create(CourseUtils.parseCourseDtoToCourse(courseDto));
    }

    @Override
    public CourseDto updateCourse(CourseDto courseDto, int id) {
        return courseRepository.update(id, CourseUtils.parseCourseDtoToCourse(courseDto));
    }

    @Override
    public CourseDto deleteCourse(int id) {
        return courseRepository.delete(id);
    }
}
