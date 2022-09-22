package com.testcases.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.vfislk.training.BasicCalculator;

class CalculatorTest {
	BasicCalculator calculator;
	@BeforeAll
	public static void init()
	{
		
		System.out.println("called before all the testcases");
	}
	
	@BeforeEach
  public void setup()
  {
		calculator=new BasicCalculator();
	  System.out.println("called before each testcases");
  }
	@Test
	public void testAdd()
	{
		System.out.println("testing.....");
		int actual=calculator.sum(2, 2);
		assertEquals(4, actual);
	}
	@Test
	public void testProduct()
	{
		System.out.println("testing.....");
		int actual=calculator.product(2, 2);
		assertEquals(0, actual);
	}
	@AfterEach
	public void teardown()
	{
		calculator=null;
		System.out.println("called after alll test cases");
	}
	@AfterAll
	public static void cleanup()
	{
		System.out.println("callled after all testcaese");
	}
}
