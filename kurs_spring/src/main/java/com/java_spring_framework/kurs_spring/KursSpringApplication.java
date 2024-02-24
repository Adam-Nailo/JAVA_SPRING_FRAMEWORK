package com.java_spring_framework.kurs_spring;

import com.java_spring_framework.kurs_spring.domain.Castle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:castle.properties")
public class KursSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(KursSpringApplication.class, args);

	}

}
