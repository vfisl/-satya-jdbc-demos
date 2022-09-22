package com.training.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class PreCreateDemo {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/trialdb";
		String username = "root";
		String password = "root";
		Connection connnection = null;
		PreparedStatement preStatement = null;
		Scanner sc = null;
		try {
			connnection = DriverManager.getConnection(url, username, password);
			String sql="create table food(name varchar(20),food_id int primary key,cost float,type varchar(20))";
			preStatement = connnection.prepareStatement(sql);
			preStatement.execute();
			
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
