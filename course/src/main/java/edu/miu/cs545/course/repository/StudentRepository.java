package edu.miu.cs545.course.repository;

import edu.miu.cs545.course.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {
    private static List<Student> students = new ArrayList<>();
    public StudentRepository(){
        Student s1 = new Student(1,"Raul","Tejada", "r.tejada@funi.com","Mechanical Engineering",3.7);
        Student s2 = new Student(2,"Veronica","Santangelo", "v.santangelo@funi.com","Computer Programming",3.82);
        Student s3 = new Student(3,"Arcade","Gannon", "a.gannon@funi.com","Medicine",3.87);
        students.add(s1);
        students.add(s2);
        students.add(s3);

    }
    public List<Student> findAll(){return students;}
    public void create(Student s){
        students.add(s);
    }
    public void delete(int id) { students.remove(id);}
    public void update(int id, Student student) {
        Student stu = students.get(id);
        if(stu==null){
            System.out.println("Its Not him");
        }else{

        }
    }
}
