package com.java_spring_framework.kurs_spring;

import com.java_spring_framework.kurs_spring.domain.repository.InMemoryRepository;
import com.java_spring_framework.kurs_spring.domain.Knight;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class KursSpringApplicationTests {

	@Autowired
	Knight knight;

	@Autowired
	InMemoryRepository inMemoryRepository;
	@Test
	void contextLoads() {
	}
	@Test
	public void testCastle(){
		String expect = "Znajduje się tu zamek o nazwie Castle Black, zamieszkały jest on przez Rycerz o imieniu Lancelot (29). Zadanie: uratuj księżniczkę";
		Assertions.assertEquals(expect, inMemoryRepository.toString());
	}
}
