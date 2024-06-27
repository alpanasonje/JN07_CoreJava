package com.tnsif.dayeleven;

public class WithExceptionHandling {

	public static void main(String[] args) {
		int a = 12, b = 10, c;
		try {
			c = a / b; 
			System.out.println("division is " + c);
		} catch (ArithmeticException e) {
			System.out.println("Division by zero error occurred");
		}
		System.out.println("-----------------------");

	}

}
