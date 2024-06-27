package com.tnsif.dayfourteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class HomegeneousList {

	public static void main(String[] args) {
		//create String type list
		ArrayList<String> nameList=new ArrayList<String>();
		nameList.add("Abhishek");
		nameList.add("Kunal");
		nameList.add("Yukta");
		nameList.add("Dhanashri");
		//nameList.add(10); CTE - other than String not allowed
		System.out.println("List is : "+nameList);
		Collections.sort(nameList);
		System.out.println("List is after sorting: "+nameList);
		
		//Create Person List
		ArrayList<Person> personList=new ArrayList<Person>();
		personList.add(new Person("Amol", "Pune", 9898979767L));
		personList.add(new Person("Neha", "Delhi", 679999979767L));
		personList.add(new Person("Pankaj", "Nagpur", 7712979767L));
		personList.add(new Person("Dhruv", "Mumbai", 9000979767L));
		personList.add(new Person("Mitali", "Pune", 8989979767L));
		System.out.println("Person List\n"+personList);
		
		//Collections.sort(personList); Person type not allowed
		System.out.println("--------------------------------");
		Iterator<Person> it=personList.iterator();
		while(it.hasNext())
		{
			Person p=it.next();
			System.out.println("Person is : "+p);
		//	it.remove();
		}
		System.out.println("--------------------------------");
		
		System.out.println(personList.size());
		Comparator<Person> comp=(p1, p2)->p1.getName().compareTo(p2.getName());
				
		Collections.sort(personList, comp);
		System.out.println("----Sorting on Ascending order of name-----------");
		System.out.println(personList);
		
		comp=(p1, p2) -> (int)(p2.getContactNo()-p1.getContactNo());
		Collections.sort(personList, comp);
		System.out.println("----Sorting on Ascending order of Contact No.-----------");
		System.out.println(personList);
				
				
				
				
				
				
				
				
				
				
				
				
				
		
		
		
	}

}
