package edu.miu.cs545.phaseII.utils;

import edu.miu.cs545.phaseII.dto.CourseDto;
import edu.miu.cs545.phaseII.entity.Course;

public class CourseUtils {
    public static CourseDto parseCourseToCourseDto(Course course){
        CourseDto courseDto = new CourseDto();
        courseDto.setId(course.getId());
        courseDto.setCode(course.getCode());
        courseDto.setName(course.getName());
        return courseDto;
    }
    public static Course parseCourseDtoToCourse(CourseDto courseDto){
        Course course =new Course();
        course.setId(courseDto.getId());
        course.setCode(courseDto.getCode());
        course.setName(courseDto.getName());
        return course;
    }
}
