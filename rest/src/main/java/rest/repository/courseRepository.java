package rest.repository;

import org.springframework.stereotype.Repository;
import rest.entity.course;

import java.util.ArrayList;
import java.util.List;

@Repository
public class courseRepository {
    private static List<course> courseList;

   static {
       courseList=new ArrayList<>();
       var c= new course();
       c.setId(1);
       c.setName("bini");
       c.setCode("cs545");
       courseList.add(c);
   }
   public List<course> getAll(){
       return courseList;
   }
   public void delete(int id){
       courseList.stream()
               .filter(x->x.getId()==(id))
               .forEach(x->courseList.remove(x));
   }

    public void save(course s) {
       var ifexist=courseList.stream()
               //.filter(x->x.getId()=s.getId())
               .noneMatch(x->x.getId()==s.getId());
       courseList.add(s);
    }

    public course getById(int id) {
      return courseList.stream()
               .filter(x->x.getId()==id)
               .findFirst()
               .orElse(null);
    }
}
