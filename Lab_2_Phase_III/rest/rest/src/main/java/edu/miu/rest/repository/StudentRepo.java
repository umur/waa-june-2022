package edu.miu.rest.repository;

import edu.miu.rest.entity.Course;
import edu.miu.rest.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class StudentRepo {

    private List<Student> students = new ArrayList<>();

    public StudentRepo()
    {
        Course c1 = new Course(1,"WAA", "CS545");
        Course c2 = new Course(2,"WAP","CS472");
        Course c3 = new Course(3,"EA", "CS544");
        Course c4 = new Course(4,"ASD","CS546");



        Student s1 = new Student(1 , "David"  , "Allen" , "Megdiwg@gmail.com" , "compro"  , 3.04 ,Arrays.asList(c2 , c3));
        Student s2 = new Student(2 , "Gabby"  , "Robert" , "Megdiwg@gmail.com" , "compro" , 3.45 , Arrays.asList(c1 , c2));
        students.add(s1);
        students.add(s2);
    }

    public List<Student> findAll()
    {
        return students;
    }

    public void createStudent(Student s)
    {
        students.add(s);
    }
    public void updateStudent(Student s)
    {
        for(Student student : students)
        {
            if(student.getId()== s.getId())
            {
                int x = students.indexOf(student);
                students.set(x , s) ;
            }
        }
    }
    public void deleteStudent(Student s)
    {
        students.remove(s);
    }
    public List<Student> getStudentsByMajor(String major)
    {
        List<Student> studentsByMajor = new ArrayList<>();
        for(Student student : students)
        {
            if(student.getMajor().equals(major))
                studentsByMajor.add(student);
        }

        return studentsByMajor;
    }

    public List<Course> getCoursesByStudentId(int studentId)
    {
        for(Student student : students)
        {
            if(student.getId() == studentId)
                return student.getCoursesTaken();
        }
        return null;
    }
}
