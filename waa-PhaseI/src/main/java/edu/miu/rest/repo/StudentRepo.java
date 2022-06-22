package edu.miu.rest.repo;

import edu.miu.rest.entity.Course;
import edu.miu.rest.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {


    private static List<Student> students = new ArrayList<>();

    public StudentRepo(){
        Course c1 = new Course(1,"WAA", "CS545");
        Course c2 = new Course(2,"WAP","CS472");
        List<Course> courses1 = new ArrayList<>();
        courses1.add(c1);
        courses1.add(c2);
        Student s1 = new Student(101,"tao","wu","123@gmail.com","CS","ct1",4);
        s1.setCourses(courses1);
        List<Course> courses2 = new ArrayList<>();
        courses2.add(c1);
        courses2.add(c2);
        Student s2 = new Student(102,"jack","li","456@gmail.com","MBA","ct2",3);
        s2.setCourses(courses2);
        List<Course> courses3 = new ArrayList<>();
        courses3.add(c1);
        courses3.add(c2);
        Student s3 = new Student(103,"tom","liu","111@gmail.com","CS","ct3",2);
        s3.setCourses(courses3);
        students.add(s1);
        students.add(s2);
        students.add(s3);
    }

    public List<Student> findAll(){
        return  students;
    }

    public void create(Student c){
        students.add(c);
    }
    public void delete(Student c){
        students.remove(c);
    }
    public void update(List<Student> stutentList){
        students=stutentList;
    }


}
