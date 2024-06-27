//Program to demonstrate handling multiple exceptions 
package com.tnsif.dayeleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		int a, b, c;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter two numbers : ");
			a = sc.nextInt();
			b = sc.nextInt();
			c = a / b;
			System.out.println("division is " + c);
			System.out.println(args[0]);
		} catch (ArithmeticException | InputMismatchException e) {
			// System.out.println("Division by zero error occurred");
			System.err.println("Error.. " + e.getMessage());
		}
		/*
		 * catch (InputMismatchException e) {
		 * System.err.println("Error.. Invalid Input " + e.getMessage()); }
		 */
		catch (Exception e) {
			System.out.println("Error occurred... " + e);
		}

		System.out.println("-----------------------");

	}

}
