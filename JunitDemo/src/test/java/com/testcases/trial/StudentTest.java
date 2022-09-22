package com.testcases.trial;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.vfislk.exceptions.InvalidNumException;
import com.vfislk.exceptions.NegValueException;
import com.vfislk.training.Student;

class StudentTest {
	Student student;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		student = new Student();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
		student = null;
	}

	@Test
	@DisplayName("testing summation")
	void testCalcTotal() throws NegValueException, InvalidNumException {
		assertEquals(17, student.calcTotal(5, 5, 7));
	}

	@Test
	@DisplayName("testing negative value")
	void testNegTotal() {
		assertThrows(NegValueException.class, () -> student.calcTotal(-40, 40, 40));
	}

	@Test
	@DisplayName("testin invalid Number ")
	void inValidNumber() {
		assertThrows(InvalidNumException.class, () -> student.calcTotal(101, 40, 40));
	}

	@Test
	@DisplayName("test grade B")
	void testGetGrade()  {
		int[] marks = { 80, 90, 80 };
		String grade = student.getGrades(marks);
		assertEquals("B", grade, "expecting grade B");
	}
	@Test
	@DisplayName("test grade Fail")
	void testGradeFail()  {
		int[] marks = { 30,50,45};
		String grade = student.getGrades(marks);
		assertEquals("Fail", grade, "expecting grade Fail");
	}
	@Test
	@DisplayName("test grade C")
	void testGradeC() {
		int[] marks = { 65,70,60};
		assertEquals("C", student.getGrades(marks));
	}
	@Test
	@DisplayName("test grade D")
	void testGradeD()  {
		int[] marks = { 60,50,50};
		assertEquals("D", student.getGrades(marks));
	}
	@Test
	@DisplayName("test grade A")
	void testGradeA()  {
		int[] marks = { 100,100,100};
		assertEquals("A", student.getGrades(marks));
	}
	@Test
	@DisplayName("test for null")
	@Tag("null")
	void testGradeNull()  {
		int[] marks = null;
		assertNull(student.getGrades(marks));
	}
	@Test
	@DisplayName("test grade negative value")
	void testGradeNegtive() throws NegValueException, InvalidNumException {
		int[] marks = { -30,50,45};
		assertThrows(NegValueException.class, ()->student.getGrades(marks));
	}@Test
	@DisplayName("test grade invalid number value")
	void testGradeInvalidNum() throws NegValueException, InvalidNumException {
		int[] marks = { 30,50,101};
		assertThrows(InvalidNumException.class, ()->student.getGrades(marks));
	}
}