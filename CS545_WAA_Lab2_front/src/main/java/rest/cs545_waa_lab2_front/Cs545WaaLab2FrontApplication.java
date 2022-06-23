package rest.cs545_waa_lab2_front;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Cs545WaaLab2FrontApplication {

    @Bean
    public ModelMapper modelMapper(){
        return  new ModelMapper();
    }
    public static void main(String[] args) {
        SpringApplication.run(Cs545WaaLab2FrontApplication.class, args);
    }

}
