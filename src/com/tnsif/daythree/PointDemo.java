package com.tnsif.daythree;

public class PointDemo {

	public static void main(String[] args) {
		Point p1;
		p1=new Point(); //default constructor
		p1.display();
		Point p2=new Point(4.50f); // single parameter constructor
		p2.display();
		Point p3=new Point(12.50f, 60.75f); // two parameters constructor
		p3.display();
		p1.setX(20);
		p1.setY(45.10f);
		//p1.display();
		System.out.println(p1.getX()+", "+p1.getY());
	}

}
