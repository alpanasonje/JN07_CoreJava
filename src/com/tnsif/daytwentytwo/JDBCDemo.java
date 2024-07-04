package com.tnsif.daytwentytwo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
		
		try {
			//Load JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded Successfully...");
			
			//Establish a connection with database (jn07)
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jn07","root","Admin@123");
			System.out.println("Connection established successfully....");
			//creating statement 
			Statement st=cn.createStatement();
			//Execute the query and process the result
			ResultSet rs=st.executeQuery("SELECT * FROM student");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
			}
			System.out.println("----------------------------------");
			//Terminate the connection
			cn.close();
			System.out.println("Connection terminated successfully....");
			System.out.println("------------------------------------");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
