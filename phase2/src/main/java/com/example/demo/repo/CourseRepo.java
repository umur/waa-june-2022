package com.example.demo.repo;

import com.example.demo.entity.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CourseRepo {
  private static List<Course> courses = new ArrayList<>();

  public CourseRepo() {
    Course c1 = new Course(1, "course1", "cs343");
    Course c2 = new Course(2, "course2", "cs343");

    courses.add(c1);
    courses.add(c2);

  }
//findCourses
  public List<Course> findAll() {
    return courses;
  }
 //create
  public void  create(Course course){
    courses.add(course);
  }
  //delete
  public void delete(int id){
    if(courses.stream().filter(st->st.getId()==id).collect(Collectors.toList()).size()==1){
      courses.remove(id);
      System.out.println("deleted");
    }else{
      System.out.println("no element to delete");
    }

  }
//update
  public void update(int id, Course course){
    if(courses.stream().filter(st->st.getId()==id).collect(Collectors.toList()).size()==1){
      courses.set(id,course);

    }else{
      System.out.println("no id found to update");
    }
  }


}
