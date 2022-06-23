package com.phase4;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Phase4Application {
	@Bean
	public ModelMapper getModelMapper()
	{
		try {
			return new ModelMapper();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	public static void main(String[] args) {
		SpringApplication.run(Phase4Application.class, args);
	}

}
