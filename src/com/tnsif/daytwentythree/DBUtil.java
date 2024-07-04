package com.tnsif.daytwentythree;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	static Connection cn;

	public static Connection getCn() throws ClassNotFoundException, SQLException {
		// Load JDBC driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Successfully...");

		// Establish a connection with database (jn07)
		cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jn07", "root", "Admin@123");
		

		return cn;
	}
	
	public static void closeConnection() throws SQLException
	{
		if (cn!=null)
			cn.close();
	}
}
