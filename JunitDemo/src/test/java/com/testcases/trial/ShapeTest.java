package com.testcases.trial;
import com.vfislk.training.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.vfislk.training.Shape;

class ShapeTest {
  Shape shape;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		shape=new Shape();
	}

	

	@Test@DisplayName("testing return value")
	void testShape() {
		assertEquals(4,shape.calcArea(2,2));
	}
	@AfterEach
	void tearDown() throws Exception {
		shape=null;
	}
}
