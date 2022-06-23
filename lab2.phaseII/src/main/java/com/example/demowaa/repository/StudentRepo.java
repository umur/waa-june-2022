package com.example.demowaa.repository;

import com.example.demowaa.Entity.Course;
import com.example.demowaa.Entity.Student;
import com.example.demowaa.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {
    @Autowired
    private CourseRepo courseRepo;
    @Autowired
    private CourseService courseService;
    private static List<Student> students=new ArrayList<>();

    public StudentRepo(){
        Student s=new Student();
        List<Course> courses =new ArrayList<>();
        Course c1=new Course(1,"WAA","545");
        Course c2=new Course(2,"EA","544");
        courses.add(c1);
        courses.add(c2);

        s.setId(1);
        s.setFirstName("kulut");
        s.setCourses(courses);
        s.setLastName("tesfamariam");
        s.setMajor("compro");
        s.setGpa(4);
        s.setCourses(courses);
        students.add(s);


    }


    public List<Student> findAll(){

        return students;
    }
    public void create(Student c){
        students.add(c);
    }
    public String delete(int id){
        for(Student s:students) {
            if (s.getId() == id)

                students.remove(s);
        }
        return "deleted";
    }
    public boolean update(Student c,int id) {
        boolean update=false;
        for (Student s : students) {
            if (s.getId() == id) {
               students.add(c);
               update=true;
            }
        }
        return update;
    }
}
