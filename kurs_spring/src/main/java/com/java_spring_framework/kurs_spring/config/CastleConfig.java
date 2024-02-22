package com.java_spring_framework.kurs_spring.config;

import com.java_spring_framework.kurs_spring.domain.Castle;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:castle.properties")
@Import(MainConfig.class)
public class CastleConfig {


}
