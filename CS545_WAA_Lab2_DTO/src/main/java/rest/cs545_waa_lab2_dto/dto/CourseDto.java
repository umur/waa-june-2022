package rest.cs545_waa_lab2_dto.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import rest.cs545_waa_lab2_dto.entity.Course;

@Data
@AllArgsConstructor
public class CourseDto {
    private int id;
    private String courseName;
    private String code;

//    public CourseDto courseDto(Course course) {
//        CourseDto dto = new CourseDto();
//       dto.setId(course.getId());
//       dto.setCourseName(course.getCourseName());
//       dto.setCode(course.getCode());
//       return dto;
//    }
//    public  Course toEntity(){
//        Course course = new Course();
//        course.setId(this.id);
//        course.setCourseName(this.courseName);
//        course.setCode(this.code);
//        return course;
//    }
}
