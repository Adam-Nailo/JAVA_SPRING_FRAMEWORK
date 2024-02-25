package com.java_spring_framework.kurs_spring.domain;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by Adam Seweryn
 */
@Component
public class Castle {
@Value("${my.castle.name}")
    private String name;


    Knight knight;
    @Autowired
    public Castle(@Qualifier(value="lancelot") Knight knight) {
        this.knight = knight;
    }

    Castle(String name, Knight knight) {
        this.name = name;
        this.knight = knight;
    }


    public void build() {
        System.out.println("Wybudowano zamek " + name);
    }


    public void tearDown() {
        System.out.println("Zaraz wyburzymy zamek " + name);
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Znajduje się tu zamek o nazwie " + this.name + ", zamieszkały jest on przez " + knight;
    }
}
