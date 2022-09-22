package com.training.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultDemo {
public static void main(String[] args) {
	String url="jdbc:mysql://localhost:3306/trialdb";
	String username="root";
	String password="root";
	Connection connnection=null;
	Statement statement=null;
	ResultSet rs=null;
	try {
		 connnection=DriverManager.getConnection(url,username,password);
	 statement=connnection.createStatement();
		String sql="select * from policy";
		 rs=statement.executeQuery(sql);
				while(rs.next())
				{
					String name=rs.getString("name");
					int policyId=rs.getInt("policy_id");
					String type =rs.getString(3);
					float premium=rs.getFloat("premium");
					System.out.println(name +"\t"+policyId+"\t"+type+"\t"+premium);
					System.out.println();
					
				}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	finally
	{
		try
		{
			if(connnection!=null)
				connnection.close();
			if(statement!=null)
				statement.close();
			if(rs!=null)
				rs.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
}
