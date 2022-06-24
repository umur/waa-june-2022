package miu.edu.lab1phase3.repo;

import miu.edu.lab1phase3.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class StudentRepo {
    private static List<Student> studentList = new ArrayList<>();

    public StudentRepo() {
        Student s1 = new Student(1, "Ashish","Ghimire", "ashish2gmail.com","MSCS", CourseRepo.findAll(), 3.5);
        Student s2 = new Student(2,"Sachin", "Tondan", "sachin@gmail.com","MSCSS" , CourseRepo.findAll(), 3.6);
        studentList.add(s1);
        studentList.add(s2);
    }

    public List<Student> findAll(){
        return studentList;
    }
    public void delete(int id)
    {
        studentList.remove(id);

    }

    public void create(Student s){
        studentList.add(s);
    }

    public void update(int id, Student s){
        studentList.set(id, s);
    }

    public Student findById(int id) {
        return studentList.stream().filter(student -> student.getId() == id).findFirst().get();
    }
}
