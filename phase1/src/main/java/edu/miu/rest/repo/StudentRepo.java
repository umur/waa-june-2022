package edu.miu.rest.repo;

import edu.miu.rest.entity.Course;
import edu.miu.rest.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class StudentRepo {
    private static List<Student> students = new ArrayList<>();
    public static int autoIncrement = 1;

    public StudentRepo(){
        Course c1 = new Course(1,"WAA","576");
        Course c2 = new Course(2,"WAP","472");
        List<Course> courseList = List.of(c1,c2);

        Student st1 = new Student(1,"Alisher","Abdullaev",
                "example@gmail.com", "CS", 3.5, courseList);

        students.add(st1);
    }

    public List<Student> findAll() {
        return students;
    }

    public List<Student> findByMajor(String major){
        return students.stream()
                .filter(student -> student.getMajor().equals(major))
                .collect(Collectors.toList());
    }

    public Student findById(int id) {
        return students.stream()
                .filter(student -> student.getId() == id)
                .findFirst().orElse(null);
    }

    public List<Course> findCoursesByStudentId(int id) {
        Student student = this.findById(id);
        return student.getCoursesTaken();
    }


    public Student addStudent(Student student){
        autoIncrement++;
        student.setId(autoIncrement);
        students.add(student);
        return student;
    }

    public Student updateStudent(Student student) {
        int id = student.getId();
        Student st = findById(id);
        st.setFirstName(student.getFirstName());
        st.setLastName(student.getLastName());
        st.setMajor(student.getMajor());
        st.setEmail(student.getEmail());
        st.setGpa(student.getGpa());
        st.setCoursesTaken(student.getCoursesTaken());
        return st;
    }

    public void deleteStudentById(int id){
        Student student = findById(id);
        students.remove(student);
    }
}
