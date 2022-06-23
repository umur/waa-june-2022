package edu.miu.lab2.phase1.repo;

import edu.miu.lab2.phase1.entity.Course;
import edu.miu.lab2.phase1.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {


    List<Student> students = new ArrayList<>();

    List<Course> courses1=new ArrayList<>();

    public StudentRepo(){
        Course c1 = new Course(1,"WAA", "CS545");
        Course c2 = new Course(2,"WAP","CS472");
        courses1.add(c1);
        courses1.add(c2);
        Student s1=new Student(1,"Ramila","Damai","rd@gmail.com","MSCS",courses1,"4");
        Student s2=new Student(2,"kamila","Damai","kd@gmail.com","MSCS",courses1,"3.9");
        students.add(s1);
        students.add(s2);
    }



    public List<Student> findAll() {
        return students;
    }

    public void createStudent(Student s) {
        students.add(s);
    }

    public void deleteStudent(int id) {
        students.removeIf(student -> student.getId() == id);
    }

    public void updateStudent(Student s, int id){

        for(int i=0;i<students.size();i++){
            if(students.get(i).getId()==id) {
                students.set(i,s);
                break;
            }
        }

    }

    public List<Course> getCoursesByStudentId(int studentId) {
        for (Student student : students) {
            if (student.getId() == studentId) {
                return student.getCourseTaken();
            }
        }
        return null;
    }

    public List<Student> getStudentByMajor(String major){
        return students.stream().filter(student -> student.getMajor()==major).toList();
    }

}
