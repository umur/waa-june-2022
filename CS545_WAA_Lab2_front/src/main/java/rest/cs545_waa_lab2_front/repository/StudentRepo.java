package rest.cs545_waa_lab2_front.repository;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import rest.cs545_waa_lab2_front.entity.Course;
import rest.cs545_waa_lab2_front.entity.Student;

import java.util.ArrayList;
import java.util.List;

@Repository

public class StudentRepo {

    private static List<Student> students= new ArrayList<>();

    public StudentRepo(){
        Course c1 = new Course(1,"WAA","CS545");
        Course c2 = new Course(2,"WAP","CS445");
        Course c3 = new Course(3,"ASD","CS525");
        List<Course> courses= new ArrayList<>();
        courses.add(c1);
        courses.add(c2);
        courses.add(c3);
        Student std1= new Student(1,"Luwam","Tsegay","luwam@gmail.com","COMPRO",courses,3.9);
        Student std2= new Student(2,"Fili","Tsegay","fili@gmail.com","COMPRO",
                List.of(new Course(4,"FPP","CS385"),new Course(5,"MPP","CS425")),4.0);
        Student std3= new Student(3,"Fili","Tsegay","fili@gmail.com","MSD",courses,3.0);
        students.add(std1);
        students.add(std2);
        students.add(std3);
    }
    public List<Student> findAllStudents(){
        return  students;
    }


    public void save(Student std){
        students.add(std);
    }
}
