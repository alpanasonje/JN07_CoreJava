package com.tnsif.daynine;

public class ConstructorDemo {

	public static void main(String[] args) {
		Point p1=new Point();
		
		Point p2=new Point(10, 20.50f);
		
		Point p3=new Point(10.20f, 20.30f);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	}

}
