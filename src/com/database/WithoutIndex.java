package com.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class WithoutIndex {
	
	public void getTimeWithIndex(Connection con) {
		Statement stmt;
		try {
			stmt = con.createStatement();
			stmt.execute("ALTER TABLE student ADD INDEX nameIndex (last)");
			long startTime = System.currentTimeMillis();
			stmt.executeQuery("SELECT * FROM student WHERE last='%a%'");
			long endTime = System.currentTimeMillis();
			System.out.printf("Time taken to execute select after index statemet is : %d ms",endTime-startTime);
			stmt.execute("ALTER TABLE student DROP INDEX nameIndex");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
