package com.java_spring_framework.kurs_spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Adam Seweryn
 */
@Component
public class Hi implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World!!!");
    }
}
