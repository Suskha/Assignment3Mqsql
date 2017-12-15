package com.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class WithIndex {
	
	public void getTimeWithoutIndex(Connection con) {
		Statement stmt;
		try {
			stmt = con.createStatement();
			long startTime = System.currentTimeMillis();
			stmt.executeQuery("SELECT * FROM student WHERE last='%a%'");
			long endTime = System.currentTimeMillis();
			System.out.printf("Time taken to execute select without index statemet is : %d ms",endTime-startTime);
			System.out.println();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}


}
