package com.java_spring_framework.kurs_spring.utils;

import com.java_spring_framework.kurs_spring.utils.Role;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class RoleRepository {

    @PersistenceContext
    EntityManager em;

    @Transactional
    public void persistRole(Role role) {
        em.persist(role);
    }
}
