package com.tnsif.daytwentythree;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class JDBCDemo {

	public static void main(String[] args) {
		Connection cn;
		List<Employee> empList;
		try {
				EmployeeService service=new EmployeeService();
				empList= service.getAllEmployees();
				System.out.println(empList);
			
		} catch ( SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
