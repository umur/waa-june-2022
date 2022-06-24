package edu.miu.cs545.phaseII.repository;

import edu.miu.cs545.phaseII.dto.CourseDto;
import edu.miu.cs545.phaseII.entity.Course;
import edu.miu.cs545.phaseII.utils.CourseUtils;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepository {
    private static final List<Course> courses = new ArrayList<>();
    public CourseRepository(){
        Course c1 = new Course(1,"Fundamentals of Fundamentals", "FN101");
        Course c2 = new Course(2,"Advanced Fundamentals", "FN102");
        Course c3 = new Course(3,"Fundamentals 3: Revenge of the Fundamentals", "FN666");
        courses.add(c1);
        courses.add(c2);
        courses.add(c3);
    }

    public List<Course> findAll(){
        return courses;
    }

    public CourseDto create(Course c){
        courses.add(c);
        return CourseUtils.parseCourseToCourseDto(c);
    }

    public CourseDto delete(int id) {
        for (Course c: courses) {
            if(c.getId()==id){
                Course tempCourse= c;
                courses.remove(c);
                return CourseUtils.parseCourseToCourseDto(tempCourse);
            }
        }
        return null;
    }

    public CourseDto update(int id, Course course) {
        Course crs = courses.get(id-1);
        if(crs==null){
            System.out.println("Its Not It");
        }else{
            crs.setCode(course.getCode());
            crs.setName(course.getName());
            return CourseUtils.parseCourseToCourseDto(crs);
        }
        return null;
    }
}
