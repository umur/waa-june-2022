package edu.miu.lab2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "edu.miu")
public class CrudOperationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudOperationsApplication.class, args);
	}

}
