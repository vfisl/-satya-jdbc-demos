package com.vfislk.training;

import java.util.Arrays;
import java.util.List;

public class User {
	public String greet(String userName)
	{
		if(userName==null)
			return null;
		return "Great day :"+userName;
	}
  public List<String> showFruits()
  {
	  return Arrays.asList("apple","mango","banana","dalim");
	  
  }
}
