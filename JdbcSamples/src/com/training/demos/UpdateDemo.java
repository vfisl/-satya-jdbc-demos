package com.training.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateDemo {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/trialdb";
		String username = "root";
		String password = "root";
		Connection connnection = null;
		Statement statement = null;
		Scanner sc = null;
		try {
			connnection = DriverManager.getConnection(url, username, password);
			statement = connnection.createStatement();
			sc = new Scanner(System.in);
			System.out.println("enter policy type to update");
			String policytype = sc.next();
			String sql = "update policy set type='" + policytype + "' where policy_id=1006";
			int result = statement.executeUpdate(sql);
			System.out.println("table updated " + result);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (connnection != null)
					connnection.close();
				if (statement != null)
					statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
