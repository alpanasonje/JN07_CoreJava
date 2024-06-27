package com.tnsif.daynine.runtimepolymorphism;

public class Person {
	private String name;
	private String city;
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Person(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}
	
	

}
