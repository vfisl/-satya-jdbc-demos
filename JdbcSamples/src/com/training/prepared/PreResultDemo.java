package com.training.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreResultDemo {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/trialdb";
		String username="root";
		String password="root";
		Connection connection=null;
		PreparedStatement prestatment=null;
		Statement statement=null;
		ResultSet resultset=null;
		try {
			 connection=DriverManager.getConnection(url,username,password);
			 
			 String sql="select * from food where type=?";
		     prestatment=connection.prepareStatement(sql);
		     prestatment.setString(1, "veg");
		     resultset=prestatment.executeQuery();
		     while(resultset.next())
		     {
		    	 String name=resultset.getString("name");
		    	 int foodId=resultset.getInt("food_id");
		    	 String type=resultset.getString("type");
		    	 float cost=resultset.getFloat("cost");
		    	 System.out.println(name+"\t"+foodId+"\t"+type+"\t"+cost);
		     }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(connection!=null)
					connection.close();
				if(statement!=null)
					statement.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
	}
}
