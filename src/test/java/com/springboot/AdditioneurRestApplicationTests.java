package com.springboot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.springboot.services.AdderService;

@SpringBootTest
class AdditioneurRestApplicationTests {
	private AdderService a = new AdderService();
	
	
	@Test
	void contextLoads() {
		int sum = a.currentBase();
		assertEquals(10, sum);;
	}

}
