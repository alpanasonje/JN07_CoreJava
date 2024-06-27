package com.tnsif.dayten;

import java.util.Scanner;

public class MultiDimArray {
	public static void displayMatrix(int a[][]) {
		for(int i=0;i<a.length;i++)
		{
			for(int j=0; j<a[i].length;j++)
				System.out.print(a[i][j]+"\t");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int a[][];

		int m, n;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows and columns : ");
		m = sc.nextInt();
		n = sc.nextInt();
		a = new int[m][n];
		displayMatrix(a);

		// Jagged Array
		int b[][] = { { 12, 34 }, { 11, 22, 33, 44, 55 }, { 500 } };
		displayMatrix(b);
	}
}
