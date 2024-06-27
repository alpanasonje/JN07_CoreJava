package com.tnsif.daynine;

public class Point {

	float pointA;
	float pointB;

	public Point() {

		System.out.println("This is Points Class Default Constructor");
	}

	public Point(float value) {

		this.pointA = value;
		this.pointB = value;

	}

	public Point(float pointA, float pointB) {

		this.pointA = pointA;
		this.pointB = pointB;

	}

	@Override
	public String toString() {
		return "Point (" + pointA + ", " + pointB + ")";
	}

}