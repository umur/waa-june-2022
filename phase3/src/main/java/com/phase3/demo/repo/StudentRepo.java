package com.phase3.demo.repo;
import com.phase3.demo.entity.Course;
import com.phase3.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class StudentRepo {
  private static final List<Student> studentList = new ArrayList<>();

  List<Course> courseList = new ArrayList<>();
  List<Course>courseList1 = new ArrayList<>();


  public StudentRepo() {
    courseList1.add(new Course(12,"course12","cs555"));
    courseList1.add(new Course(13,"course13","cs544"));
    courseList1.add(new Course(14,"course14","cs600"));
    Student c1 = new Student(1, "Sachin", "Tandan", "Standan@miu.edu", "major1", courseList1, 3.5);
    Student c2 = new Student(2, "Sac", "Tandan", "Standan12@miu.edu", "major2", courseList1, 4.5);

  }

  //find
  public List<Student> findAll() {
    return studentList;
  }

  //create
  public void create(Student student) {
    studentList.add(student);
  }

  //delete
  public void delete(int id) {
    if (studentList.stream().filter(st -> st.getId() == id).collect(Collectors.toList()).size() == 1) {
      studentList.remove(id);
      System.out.println("deleted");
    } else {
      System.out.println("no element to delete");
    }

  }

  //update
  public void update(int id, Student student) {
    if (studentList.stream().filter(st -> st.getId() == id).collect(Collectors.toList()).size() == 1) {
      studentList.set(id, student);

    }
  }

  //findByMajor
  public List<Student> getStudentsByMajor(String major) {

    return studentList.stream().filter(st -> st.getMajor().equalsIgnoreCase(major)).collect(Collectors.toList());
  }

  public List<Course> getCoursesByStudentId(int studentId) {
    if (studentList.stream().filter(st -> st.getId() == studentId).collect(Collectors.toList()).size() == 1) {
      List<Student> studentList1 = studentList.stream()
              .filter(st -> st.getId() == studentId)
              .collect(Collectors.toList());
      for (Student st : studentList1
      ) {
        courseList = st.getCoursesTaken();
      }

      return courseList;
    } else {
      return null;
    }
  }
}