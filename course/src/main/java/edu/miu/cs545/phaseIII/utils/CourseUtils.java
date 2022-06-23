package edu.miu.cs545.phaseIII.utils;

import edu.miu.cs545.phaseIII.dto.CourseDto;
import edu.miu.cs545.phaseIII.entity.Course;
import org.modelmapper.ModelMapper;

public class CourseUtils {
    private static final ModelMapper mapper = new ModelMapper();

    public static CourseDto parseCourseToCourseDto(Course course){
        return mapper.map(course, CourseDto.class);
    }
    public static Course parseCourseDtoToCourse(CourseDto courseDto){
        return mapper.map(courseDto, Course.class);
    }
}
