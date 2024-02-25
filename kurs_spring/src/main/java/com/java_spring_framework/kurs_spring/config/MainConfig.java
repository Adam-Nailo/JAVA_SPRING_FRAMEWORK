package com.java_spring_framework.kurs_spring.config;

import com.java_spring_framework.kurs_spring.domain.Castle;
import com.java_spring_framework.kurs_spring.domain.Knight;
import com.java_spring_framework.kurs_spring.domain.Quest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
//@ImportResource("classpath:config/castle-config.xml")
//@PropertySource("classpath:castle.properties")
public class MainConfig {

   @Autowired
   Quest quest;

    @Bean(name = "lancelot")
    @Primary
    public Knight lancelot() {
        Knight lancelot = new Knight("Lancelot", 29);
        lancelot.setQuest(quest);
        return lancelot;
    }

    @Bean(name = "percival")
    public Knight percival() {
        Knight percival = new Knight("Percival", 25);
        percival.setQuest(quest);
        return percival;
    }
//    @Bean(name = "zamek", initMethod = "build", destroyMethod = "tearDown")
//    @Value("${my.castle.name}")
//    public Castle castle(String name) {
//        Castle castle = new Castle(knight());
//        castle.setName(name);
//        return castle;
//    }



}
