package com.vfislk.training;

import com.vfislk.exceptions.InvalidNumException;
import com.vfislk.exceptions.NegValueException;

public class Student {

	public int calcTotal(int marks1, int marks2, int marks3) throws NegValueException, InvalidNumException {
		if (marks1 < 0 || marks2 < 0 || marks3 < 0) {
			throw new NegValueException("marks should be greater than zero or zero");
		}
		if (marks1 > 100 || marks2 > 100 || marks3 > 100) {
			throw new InvalidNumException("marks should be 100 or less than 100");
		}
		return marks1 + marks2 + marks3;
	}

	public String getGrades(int[] marks) throws NegValueException, InvalidNumException {
		
		int sum = 0; 
		String grade=null;
		if(marks==null)
			return null;
		for (int mark : marks) {
			if (mark < 0) 
				throw new NegValueException("you enter negative value");
		    if (mark > 100) 
				throw new InvalidNumException("mark should not exceed 100");
				sum += mark;
				
			}
		int average = sum /marks.length;
		
	    if (average > 90)
			grade ="A";
	    if (average > 80 && average < 90)
			grade="B";
	    if (average > 60 && average < 80)
			grade= "C";
		if (average > 50 && average < 60)
			grade= "D";
		if (average <50)
			grade= "Fail";
			return grade ;

	}
}
