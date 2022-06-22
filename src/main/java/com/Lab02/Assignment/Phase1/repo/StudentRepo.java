package com.Lab02.Assignment.Phase1.repo;

import com.Lab02.Assignment.Phase1.entity.Course;
import com.Lab02.Assignment.Phase1.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class StudentRepo {

    private static List<Student> listStudents = new ArrayList<>();

    public  StudentRepo(){
        Student s1= new Student(1, "Puskar", "Budhathoki", "pbudhathoki@miu.edu", "CS", "B", List.of(new Course[]{
                new Course(1, "WAA", "CS5"),
                new Course(2, "WAP", "CS4"),
                new Course(3, "MPP", "CS3")
        }));

        Student s2= new Student(1, "Nirmal", "Silwal", "nsilwal@miu.edu", "CS", "A", List.of(new Course[]{
                new Course(1, "WAA", "CS5"),
                new Course(2, "EA", "CS4"),
                new Course(3, "MPP", "CS3")
        }));
        listStudents.add(s1);
        listStudents.add(s2);
    }

    public static List<Student> getListStudents() {
        return listStudents;
    }

    public static void  saveStudent(Student s){
        listStudents.add(s);
    }

    public List<Student> getStudentsByMajor(String major) {
        return listStudents.stream()
                .filter(s -> s.getMajor() == major)
                .collect(Collectors.toList());
    }

    public List<Course> getCoursesByStudentId(int id) {
        return listStudents.stream()
                .filter(s -> s.getId() == id)
                .map(student -> student.getCoursesTaken())
                .flatMap(c -> c.stream())
                .collect(Collectors.toList());
    }

    public static void deleteStudent(int id){
        listStudents.removeIf(s->s.getId()==id);

    }

    public static void updateStudent(Student s, int id){
        for (int i=0; i<listStudents.size();i++){
            if(listStudents.get(i).getId()==id){
                listStudents.set(i,s);
            }
        }

    }

}
