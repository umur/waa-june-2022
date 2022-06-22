package rest.repository;

import org.springframework.stereotype.Repository;
import rest.entity.Student;
import rest.entity.course;
import rest.service.courseService;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {
  //  private static List<course> courseList= new ArrayList<course>();
    private static List<Student> studentList= new ArrayList<>();
    private final courseService courseService;

    public StudentRepository(courseService courseService) {
        this.courseService = courseService;
        studentList = new ArrayList<>();
        var s = new Student();
        s.setId(1);
        s.setFirstName("nahom");
        s.setLastName("debre");
        s.setEmail("nn@gmail.com");
        s.setCoursesTaken(courseService.getAll());
        s.setGpa(0.8);
        studentList.add(s);
    }
    public void save(Student s){
//        for(Student h:s){
//            if(s.getId()!=h.getId())
//                studentList.add(s);
        var ifexist=studentList.stream()
                .noneMatch(x->x.getId()==s.getId());
        studentList.add(s);

        }
        public void delete(int id){
        studentList.stream()
                .filter(x->x.getId()==id)
                .forEach(x->studentList.remove(x));
        }
        public List<Student> getAll(){
        return studentList;

        }
        public Student getById(int id){
        return studentList.stream()
                .filter(x->x.getId()==id)
                .findFirst()
                .orElse(null);
        }
        public List<course> getCourseByStudent(int id){
        return studentList.stream()
                .filter(x->x.getId()==id)
                .findFirst().orElse(null)
                .getCoursesTaken();

        }

    }





