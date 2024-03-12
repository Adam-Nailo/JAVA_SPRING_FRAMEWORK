package com.java_spring_framework.kurs_spring.config;

import com.java_spring_framework.kurs_spring.domain.repository.DBKnightRepository;
import com.java_spring_framework.kurs_spring.domain.repository.InMemoryRepository;
import com.java_spring_framework.kurs_spring.domain.repository.KnightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@Configuration
public class MainConfig {

    @Bean(name = "inMemoryKnightRepository")
    @Profile("dev")
    public KnightRepository createInMemoryRepo() {
        KnightRepository repo = new InMemoryRepository();
        return repo;
    }

    @Bean(name = "DBKnightRepository")
    @Profile("prod")
    public KnightRepository createDBKnightRepo() {
        KnightRepository repo = new DBKnightRepository();
        return repo;
    }
}
