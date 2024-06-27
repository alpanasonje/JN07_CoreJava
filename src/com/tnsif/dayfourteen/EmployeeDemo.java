package com.tnsif.dayfourteen;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeDemo {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(101, "Ramesh", 67000));
		empList.add(new Employee(105, "Suresh", 81000));
		empList.add(new Employee(103, "Rakesh", 78000));
		empList.add(new Employee(102, "Mahesh", 56000));
		empList.add(new Employee(104, "Ritesh", 72000));
		System.out.println("Employee Details : \n" + empList);
		System.out.println("------------------------------------");
		Collections.sort(empList, new SortByEmployeeName());
		System.out.println("Employee Details Ascending order of Name: \n" + empList);
		System.out.println("-----------------------------");
		Collections.sort(empList, new SortBySalary());
		System.out.println("Employee Details Ascending order of Salary: \n" + empList);

	}

}
