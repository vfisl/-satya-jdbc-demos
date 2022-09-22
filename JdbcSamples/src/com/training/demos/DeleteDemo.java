package com.training.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteDemo {

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
			System.out.println("enter policy policyId to update");
			int policytype = sc.nextInt();
			String sql = "delete from policy where policy_id=" + policytype ;
			int result = statement.executeUpdate(sql);
			System.out.println("row deleted " + result);
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
