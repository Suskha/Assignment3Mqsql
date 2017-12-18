package com.database;

import java.sql.*;
import java.util.Scanner;

public class DatabaseConnect {

	private Scanner input = new Scanner(System.in);
	private String userName ;
	private String password;
	
	public void DatabaseConn() {

		WithIndex withIndex = new WithIndex();
		WithoutIndex withoutIndex = new WithoutIndex();
		
		System.out.print("Enter the username of your database : ");
		userName = input.nextLine();
		System.out.print("Enter the password of your database : ");
		password = input.nextLine();
		System.out.println();
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/student", userName, password);
			withIndex.getTimeWithoutIndex(con);
			withoutIndex.getTimeWithIndex(con);
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	
	
	
}