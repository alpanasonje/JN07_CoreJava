package com.tnsif.dayone;
public class DivisionDemo {
	public static void main(String[] args) {
		double x = 5.0;
		double y = 0.0;
		double ans;
		ans= x / y; // result is Infinity
		System.out.println(ans);
		
		x = -5.0;
		ans = x / y; // result is -Infinity
		System.out.println(ans);
		
		x = 0.0;
		ans = x / y; // result is NaN
		System.out.println(ans);
		int a = 5;
		int b = 0;
		int result = a / b; // Throws ArithmeticException: / by zero
		System.out.println(result);
	}
}
