package com.training.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreUpdateDemo {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/trialdb";
		String username="root";
		String password="root";
		Connection connection=null;
		PreparedStatement prestatment=null;
		Statement statement=null;
		
		try {
			 connection=DriverManager.getConnection(url,username,password);
			 
			 String sql="update food set type=? where food_id=?";
		     prestatment=connection.prepareStatement(sql);
		     prestatment.setString(1, "non_veg");
		     prestatment.setInt(2, 10);
		     prestatment.execute();
		
		     
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
