package edu.miu.cs545.phaseIII.repository;

import edu.miu.cs545.phaseIII.dto.StudentDto;
import edu.miu.cs545.phaseIII.entity.Course;
import edu.miu.cs545.phaseIII.entity.Student;
import edu.miu.cs545.phaseIII.utils.StudentUtils;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {
    private static final List<Student> students = new ArrayList<>();
    private static final CourseRepository courseRepository = new CourseRepository();
    public StudentRepository(){
        Student s1 = new Student(1,"Raul","Tejada", "r.tejada@funi.com","Mechanical Engineering",3.7);
        Student s2 = new Student(2,"Veronica","Santangelo", "v.santangelo@funi.com","Computer Programming",3.82);
        Student s3 = new Student(3,"Arcade","Gannon", "a.gannon@funi.com","Medicine",3.87);
        s1.addCoursesTaken(courseRepository.findAll().get(1));
        s2.addCoursesTaken(courseRepository.findAll().get(2));
        s3.addCoursesTaken(courseRepository.findAll().get(3));
        students.add(s1);
        students.add(s2);
        students.add(s3);

    }
    public List<StudentDto> findAll(){
        List<StudentDto> studentDtoList = new ArrayList<>();
        for(Student s: students){
            studentDtoList.add(StudentUtils.parseStudentToStudentDto(s));
        }
        return studentDtoList;
    }
    public StudentDto create(Student student){
        students.add(student);
        return StudentUtils.parseStudentToStudentDto(student);
    }
    public StudentDto delete(int id) {
        for(Student s: students){
            if(s.getId()==id){
                Student tempStudent = s;
                students.remove(s);
                return StudentUtils.parseStudentToStudentDto(tempStudent);
            }
        }
        return null;
    }
    public StudentDto update(int id, Student student) {
        for(Student s: students){
            if(s.getId()==id){
                s=student;
                return StudentUtils.parseStudentToStudentDto(s);
            }
        }
        return null;
    }

    public List<StudentDto> getStudentsByMajor(String major){
        List<StudentDto> studentList= new ArrayList<>();
        for (Student s:students) {
            studentList.add(StudentUtils.parseStudentToStudentDto(s));
        }
        return studentList;
    }

    public List<Course> getCourseByStudentId(int id) {
        for(Student s: students){
            if(s.getId()==id){
               return s.getCoursesTaken();
            }
        }
        return null;
    }
}
