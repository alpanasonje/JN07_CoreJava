package com.tnsif.daytwentythree;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements IEmployeeService{
	PreparedStatement pst;
	ResultSet rs;
	Connection cn;
	
	public EmployeeService() throws ClassNotFoundException, SQLException
	{
		cn=DBUtil.getCn();
	}
	@Override
	public List<Employee> getAllEmployees() throws SQLException {
		List<Employee> empList=new ArrayList<Employee>();
		pst=cn.prepareStatement("SELECT * FROM employee");
		rs=pst.executeQuery();
		while(rs.next())
		{
			Employee e=new Employee();
			e.setEmpId(rs.getInt(1));
			e.setEmpName(rs.getString(2));
			e.setSalary(rs.getFloat(3));
			e.setDeptName(rs.getString(4));
			e.setPost(rs.getString(5));
			empList.add(e);
		}
		return empList;
	}

	@Override
	public Employee getEmployeeById(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployee(int empId, Employee e) {
		// TODO Auto-generated method stub
		return false;
	}

}
