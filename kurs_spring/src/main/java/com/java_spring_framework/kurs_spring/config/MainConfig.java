package com.java_spring_framework.kurs_spring.config;

import com.java_spring_framework.kurs_spring.domain.Castle;
import com.java_spring_framework.kurs_spring.domain.Knight;
import com.java_spring_framework.kurs_spring.domain.Quest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
//@ImportResource("classpath:config/castle-config.xml")
//@PropertySource("classpath:castle.properties")
public class MainConfig {

//    @Bean
//    public Quest createQuest() {
//        return new Quest();
//    }
//
//    @Bean
//    @Scope("prototype")
//    public Knight knight() {
//        Knight knight = new Knight("Lancelot", 29);
//        knight.setQuest(createQuest());
//        return knight;
//    }
//    @Bean(name = "zamek", initMethod = "build", destroyMethod = "tearDown")
//    @Value("${my.castle.name}")
//    public Castle castle(String name) {
//        Castle castle = new Castle(knight());
//        castle.setName(name);
//        return castle;
//    }



}
