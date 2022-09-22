package com.training.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreInsertDemo {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/trialdb";
		String username = "root";
		String password = "root";
		Connection connnection = null;
		PreparedStatement preStatement = null;
		Scanner sc = null;
		try {
			connnection = DriverManager.getConnection(url, username, password);
		     String sql="insert into food values(?,?,?,?)";
		     preStatement=connnection.prepareStatement(sql);
		     sc=new Scanner(System.in);
			 for(int i=0;i<1;i++)
			 {
				 System.out.println("Enter food name");
				 String name=sc.next();
				 System.out.println("Enter food id");
				 int foodId=sc.nextInt();
				 System.out.println("Enter food cost");
				 float foodCost=sc.nextFloat();
				 System.out.println("Enter the price");
				 String foodType=sc.next();
				 preStatement.setString(1, name);
			     preStatement.setInt(2, foodId);
			     preStatement.setFloat(3, foodCost);
			     preStatement.setString(4, foodType);
			     preStatement.execute();
			 }
		    
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (connnection != null)
					connnection.close();
				if (preStatement != null)
					preStatement.close();
				if(sc!=null)
					sc.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
