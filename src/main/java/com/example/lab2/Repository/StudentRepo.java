package com.example.lab2.Repository;

import com.example.lab2.Entity.Course;
import com.example.lab2.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class StudentRepo {
    private List<Student> students =new ArrayList<>();
    private static List<Course> courses=new ArrayList<>();
    public StudentRepo(){
    Student s1=new Student();
    Course c1=new Course(1,"Waa","545");
    Course c2=new Course(2,"EA","544");
    courses.add(c1);
    courses.add(c2);
    s1.setId(1);
    s1.setCourses(courses);
    s1.setFirstName("kulut");
    s1.setLastName("tesfamariam");
    s1.setEmail("ktesfazghi@miu.edu");
    s1.setMajor("compro");
    s1.setGpa(4);
    students.add(s1);


    }
    public List<Student> findAll(){
        return students;
    }
    public Student getById(int id){
        Student student=null;
        for(Student stu:students) {
            if (!Objects.equals(id, stu.getId())) throw new IllegalArgumentException("nothing with this id ");
           else if(stu.getId()==id) {
               student=stu;
            }
        }
        return student;
    }
    public void add(Student s){
        students.add(s);

    }
    public String deleteById(int id){
        for(Student s:students) {
            if (!Objects.equals(id, s.getId())) throw new IllegalArgumentException("not found with this id");
            students.remove(s);
        }
        return "deleted";


    }
    public String deleteAll(){
        students.clear();
        return "all deleted";
    }
    public boolean update(int id,Student s){
        boolean result=false;
        for(Student st:students){
            if(!Objects.equals(id,st.getId())) throw new IllegalArgumentException("not found");
            students.add(s);
            result =true;
        }
        return result;
    }
    public List<Student> getStudentsByMajor(String major){
        List<Student> allstudent=new ArrayList<>();
        for(Student s:students){
            if(!Objects.equals(major,s.getMajor())) throw new IllegalArgumentException("not found");
            else if(s.getMajor()==major){
                allstudent.add(s);
            }

        }
        return allstudent;
    }
    public List<Course> getCoursesByStudentId(int studentId){
        List<Course> courses=new ArrayList<>();
        for(Student s:students){
            if(!Objects.equals(studentId,s.getId()))throw new IllegalArgumentException();
            else if(s.getId()==studentId){
                courses=s.getCourses();
            }
        }
        return courses;
    }


}
