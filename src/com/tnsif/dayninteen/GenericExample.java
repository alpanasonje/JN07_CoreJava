package com.tnsif.dayninteen;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
	/*
	 * public void display(int[] a) { for(int n:a) System.out.println(n); } public
	 * void display(String[] a) { for(String n:a) System.out.println(n); }
	 * 
	 * public void display(float[] a) { for(float n:a) System.out.println(n); }
	 */

	// Generic Method
	public <T> void display(T[] a) {
		for (T n : a)
			System.out.println(n);
	}

	// Unbounded Wildcard
	public void displayArray(List<?> a) {
		for (Object n : a)
			System.out.println(n);
	}

	// Upper bounded Wildcard -
	public void sumOfElements(List<? extends Number> a) {
		Double s = 0.0;
		for (Number n : a) {
			s += n.doubleValue();
		}
		System.out.println("Sum is " + s);
	}

	
	// Lower bounded Wildcard
	public void displayNumberList(List<? super Integer> a) {
		for (Object n : a)
			System.out.println(n);
	}

	public static void main(String[] args) {
		GenericExample obj = new GenericExample();
		Integer a[] = { 10, 20, 304, 50 };

		String[] s = { "Nashik", "Pune", "Delhi" };

		Float f[] = { 12.56f, 70f, 67.80f };

		obj.display(a);
		obj.display(f);
		obj.display(s);
		System.out.println("---------------------");
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(20);
		intList.add(30);

		obj.displayArray(intList);
		System.out.println("---------------------");
		List<String> cityList = new ArrayList<String>();
		cityList.add("Nashik");
		cityList.add("Pune");

		obj.displayArray(cityList);
		System.out.println("---------------------");
		
		obj.sumOfElements(intList);
		
		List<Float> priceList=new ArrayList<Float>();
		priceList.add(400.0f);
		priceList.add(1400.0f);
		priceList.add(6000.0f);
		System.out.println("---------------------");
		obj.sumOfElements(priceList);
		System.out.println("---------------------");
		
		//obj.sumOfElements(cityList);
		
		obj.displayNumberList(intList);
	//	obj.displayNumberList(priceList);
		//obj.displayNumberList(cityList);
	}
}
