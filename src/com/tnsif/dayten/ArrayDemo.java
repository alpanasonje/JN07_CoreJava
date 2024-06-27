package com.tnsif.dayten;

public class ArrayDemo {
	public static void main(String[] args) {
		// Array Declaration
		int arr[]; // same as int[] arr; int []arr;
		int a[], e; // a int array and e is just int
		int[] b, d; // both b and d are int array
		int[] c, f; // c int array and f is just int

		// instantiate an array
		arr = new int[5]; // array of size 5
		System.out.println(arr.length);

		// dispaly array
		// index loop
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + "\t");
		System.out.println("\n----------------------");

		// for..each loop
		for (int n : arr)
			System.out.print(n + "\t");

		// array declaration with initialization
		int barr[] = { 10, 20, 40, 50 };
		System.out.println(barr.length);
		// for..each loop
		for (int n : barr)
			System.out.print(n + "\t");

	}
}
