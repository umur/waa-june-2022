package phaseI.miu.cs545.course.repository;

import phaseI.miu.cs545.course.entity.CourseDto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepository {
    private static final List<CourseDto> courses = new ArrayList<>();
    public CourseRepository(){
        CourseDto c1 = new CourseDto(1,"Fundamentals of Fundamentals", "FN101");
        CourseDto c2 = new CourseDto(2,"Advanced Fundamentals", "FN102");
        CourseDto c3 = new CourseDto(3,"Fundamentals 3: Revenge of the Fundamentals", "FN666");
        courses.add(c1);
        courses.add(c2);
        courses.add(c3);
    }

    public List<CourseDto> findAll(){
        return courses;
    }

    public void create(CourseDto c){
        courses.add(c);
    }

    public void delete(int id) {
        for (CourseDto c: courses) {
            if(c.getId()==id){
                courses.remove(c);
            }
        }
        System.out.println("No Course FOUNDDDD");
    }

    public void update(int id, CourseDto course) {
        CourseDto crs = courses.get(id-1);
        if(crs==null){
            System.out.println("Its Not It");
        }else{
            crs.setCode(course.getCode());
            crs.setName(course.getName());
            System.out.println("Found It And Updated");
        }
    }
}
