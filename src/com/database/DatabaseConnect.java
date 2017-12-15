package com.database;

import java.sql.*;

public class DatabaseConnect {

	public void DatabaseConn() {

		WithIndex withIndex = new WithIndex();
		WithoutIndex withoutIndex = new WithoutIndex();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "");
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