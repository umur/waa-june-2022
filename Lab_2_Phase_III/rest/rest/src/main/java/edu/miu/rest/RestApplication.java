package edu.miu.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
//@EnableSwagger2
public class RestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}

//	@Bean
//	public Docket api() {
//		return new Docket(DocumentationType.SWAGGER_12)
//				.select()
//				.apis(RequestHandlerSelectors.basePackage("edu.miu.controller"))
//				.paths(PathSelectors.any())  //regex("/student.*")
//				.build();
//	}

}
