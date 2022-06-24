package rest.cs545_waa_lab2_modelmapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import rest.cs545_waa_lab2_modelmapper.entity.Course;
import rest.cs545_waa_lab2_modelmapper.entity.Student;
import rest.cs545_waa_lab2_modelmapper.repository.CourseRepo;
import rest.cs545_waa_lab2_modelmapper.repository.StudentRepo;

import java.util.List;

@SpringBootApplication
public class Cs545WaaLab2FrontendApplication {

    @Bean
    public ModelMapper modelMapper(){
        return  new ModelMapper();
    }

    public static void main(String[] args) {
        SpringApplication.run(Cs545WaaLab2FrontendApplication.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
//        Course c1= new Course();
//        c1.setId(4);
//        c1.setCourseName("FPP");
//        c1.setCode("CS390");
//        courseRepo.save(c1);
//
//        Student std= new Student();
//        std.setId(1);
//        std.setFirstName("Lilye");
//        std.setLastName("Fish");
//        std.setEmail("Lili@gmail.com");
//        std.setMajor("MSD");
//        std.setCourses(List.of(new Course(1,"ADS","CS525")));
//        std.setGpa(4.0);
//         stdRepo.save(std);
//    }

}
