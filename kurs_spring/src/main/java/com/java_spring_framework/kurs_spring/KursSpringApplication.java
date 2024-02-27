package com.java_spring_framework.kurs_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:knightRepository.properties")
public class KursSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(KursSpringApplication.class, args);

	}

}
