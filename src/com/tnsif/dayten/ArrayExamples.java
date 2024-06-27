package com.tnsif.dayten;

import java.nio.file.spi.FileSystemProvider;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayExamples {
	public static void displayArray(int a[]) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + "\t");
	}

	public static int search(int []a,int num)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				return i;
			}
		}
		return -1;
	}

	public static void minMaxOfArray(int a[]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Max: "+ a[a.length-1]);
		System.out.println("Min: "+ a[0]);
	}

	public static void main(String[] args) {
		int a[]; // a is an array of integers

		// CTE
		/*
		 * a[0]=12; System.out.println(a[0]);
		 */

		// accept size of array
		int n;
		System.out.println("Enter the size of array : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new int[n];
		displayArray(a);
		
		System.out.println("enter "+n+" numbers : ");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		displayArray(a);

		//sort the array elements
		Arrays.sort(a);
		
		//find minimum and maximum of the array - boys
		minMaxOfArray(a);
		displayArray(a);
		//search an element in the array - girls
		System.out.println("enter the element to be search : ");
		int ele=sc.nextInt();
		int pos=search(a, ele);
		if (pos!=-1)
			System.out.println(ele+" is present at "+pos+" position");
		else
			System.out.println(ele+" is not present");
		//reverse the array
	}

}
