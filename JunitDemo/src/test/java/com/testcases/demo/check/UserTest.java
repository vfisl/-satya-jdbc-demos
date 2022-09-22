package com.testcases.demo.check;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.vfislk.training.User;

class UserTest {
	User user;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}


	@BeforeEach
	void setUp() throws Exception {
		user=new User();
	}

	
	@Test@DisplayName("checking return")
	@Tag("greet")
	void testReturn() {
		String userName="Sadik";
		assertEquals("Great day :"+userName, user.greet(userName));
	}
	@Test@DisplayName("checking null")
	void testNull() {
		String userName=null;
		assertNull(user.greet(userName));
	}
	@Test@DisplayName("checking list")
	
	void testShowFruit() {
     List<String> fruits=Arrays.asList("apple","mango","banana","dalim");
		assertEquals(fruits,user.showFruits());
	}
@Test@DisplayName("checking list size")
	
	void testListSize() {
     
		assertEquals(4,user.showFruits().size());
	}
	
	
	@AfterEach
	void tearDown() throws Exception {
		user=null;
	}
	


	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}
}
