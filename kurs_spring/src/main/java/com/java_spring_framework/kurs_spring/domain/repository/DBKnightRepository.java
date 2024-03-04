package com.java_spring_framework.kurs_spring.domain.repository;

import com.java_spring_framework.kurs_spring.domain.Knight;
import jakarta.annotation.PostConstruct;
import jdk.jshell.spi.ExecutionControl;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;


public class DBKnightRepository implements KnightRepository{
    @Override
    public void createKnight(String name, int age) {
        System.out.println("Używam bazy danych.");
    }

    @Override
    public Collection<Knight> getAllKnights(){
        System.out.println("Używam bazy danych.");
        return null;
    }

    @Override
    public Optional<Knight> getKnight(String name){
        System.out.println("Używam bazy danych.");
        return null;
    }

    @Override
    public void deleteKnight(Integer id){
        System.out.println("Używam bazy danych.");
    }
    @Override
    @PostConstruct
    public void build() {
        createKnight("Lancelot",29);
        createKnight("Percival",25);
    }

    @Override
    public void createKnight(Knight knight) {
        System.out.println("Uzywam bazy danych");
    }

    @Override
    public Knight getKnightById(Integer id) {
        System.out.println("Uzywam bazy danych");
        return null;
    }

}
