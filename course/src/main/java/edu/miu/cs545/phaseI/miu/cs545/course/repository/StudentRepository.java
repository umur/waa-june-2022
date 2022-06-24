package phaseI.miu.cs545.course.repository;

import phaseI.miu.cs545.course.entity.CourseDto;
import phaseI.miu.cs545.course.entity.StudentDto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {
    private static final List<StudentDto> students = new ArrayList<>();
    private static final CourseRepository courseRepository = new CourseRepository();
    public StudentRepository(){
        StudentDto s1 = new StudentDto(1,"Raul","Tejada", "r.tejada@funi.com","Mechanical Engineering",3.7);
        StudentDto s2 = new StudentDto(2,"Veronica","Santangelo", "v.santangelo@funi.com","Computer Programming",3.82);
        StudentDto s3 = new StudentDto(3,"Arcade","Gannon", "a.gannon@funi.com","Medicine",3.87);
        s1.addCoursesTaken(courseRepository.findAll().get(1));
        s2.addCoursesTaken(courseRepository.findAll().get(2));
        s3.addCoursesTaken(courseRepository.findAll().get(3));
        students.add(s1);
        students.add(s2);
        students.add(s3);

    }
    public List<StudentDto> findAll(){return students;}
    public void create(StudentDto s){
        students.add(s);
    }
    public void delete(int id) { students.remove(id-1);}
    public void update(int id, StudentDto student) {
        StudentDto stu = students.get(id-1);
        if(stu==null){
            System.out.println("Its Not Them");
        }else{
            stu.setLastName(student.getLastName());
            stu.setFirstName(student.getFirstName());
            stu.setEmail(student.getEmail());
            stu.setGpa(student.getGpa());
            System.out.println("Found Them And Updated");
        }
    }

    public List<StudentDto> getStudentsByMajor(String major){
        return students.stream().filter(i->i.getMajor().equals(major)).toList();
    }

    public List<CourseDto> getCourseByStudentId(int id) {
        for(StudentDto s: students){
            if(s.getId()==id){
               return s.getCoursesTaken();
            }
        }
        return null;
    }
}
