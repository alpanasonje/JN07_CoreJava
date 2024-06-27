package com.tnsif.daysix;

public class Person {
	private String name;
	private String city;
	private byte age;

	public Person() {
		System.out.println("Person : Default Constructor");
	}

	public Person(String name, String city, byte age) {
		// name=name;
		this.name = name;
		this.city = city;
		this.age = age;
		System.out.println("Person : Paramterized Constructor");
	}

	public void show() {
		System.out.println("Name : " + name + ", City : " + city + ", Age : " + age);

	}

}
