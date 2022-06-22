package com.example.demo.repo;

import com.example.demo.entity.Course;
import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class StudentRepo {
  private static final List<Student> studentList = new ArrayList<>();
  @Autowired
  CourseRepo courseRepo;
  List<Course> courseList = new ArrayList<>();

  public StudentRepo() {
    Student c1 = new Student(1, "Sachin", "Tandan", "Standan@miu.edu", "major1", courseRepo.findAll(), 3.5);
    Student c2 = new Student(2, "Sac", "Tandan", "Standan12@miu.edu", "major2", courseRepo.findAll(), 4.5);

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