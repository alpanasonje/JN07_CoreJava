package com.tnsif.daythree;


public class Point {
	private float x, y;

	// default constructor
	public Point() {
		x = 0.0f;
		y = 0.0F;
	}
	// single parameter constructor
	public Point(float value) {
		x = value;
		y = value;
	}

	// two parameters constructor
	public Point(float a, float b) {
		x = a;
		y = b;
	}

	public void setX(float value) {
		x = value;
	}

	public void setY(float value) {
		y = value;
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public void display() {
		System.out.println("Point is (" + x + ", " + y + ")");
	}
}
