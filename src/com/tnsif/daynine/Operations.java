//Program to demonstrate method overloading - Defining same name 
//method with different signature within same scope
// Different signature includes - # of parameters
//data type of parameters
//order of data types
package com.tnsif.daynine;

public class Operations {
	// without arguments
	public static void add() {
		System.out.println("Addition");
	}

	// with one int argument
	public static void add(int a) {
		System.out.println("Addition is " + a);
	}

	// with two int arguments
	public static void add(int a, int b) {
		System.out.println("Addition is " + (a + b));
	}

	// with one int and one float arguments
	public static void add(int c, float d) {
		System.out.println("Addition is " + (c + d));
	}

	// with one int and one float arguments
	public static void add(float c, int d) {
		System.out.println("Addition is " + (c + d));
	}

}
