package com.tnsif.dayninteen;

import java.util.Comparator;

import com.tnsif.dayfourteen.Student;

public class Demo {

	public static void main(String[] args) {
		GenericMethodClass obj=new GenericMethodClass();
		obj.show(10);
		obj.show("Hello");
		obj.show(45.10);
		obj.show(true);
		obj.show(new Student(1, "Anish", 70));
		
		//create array of integers
		Integer a[]= {100,20,300,40,50};
		GenericClass<Integer> intArray=new GenericClass<Integer>(a);
		intArray.printArray();
		
		//create array of String
		String s[]= { "Hello", "Good Afternoon","Hi", "Bye"};
		GenericClass<String> strArray=new GenericClass<String>(s);
		strArray.printArray();
		
		System.out.println("-------------------------------------");
		MyGenericClass obj1=new MyGenericClass();
		System.out.println(obj1.getMax(a));
		System.out.println(obj1.getMax(s));
		
		System.out.println(obj1.getMin(a));
		System.out.println(obj1.getMin(s));
		
		obj1.sort(a);
		obj1.printArray(a);
		
		
	}

}
