package com.tnsif.daysix;

public class Teacher extends Person {
	private String qualification;
	private String subject;
	private int exp;

	public Teacher() {
		System.out.println("Teacher : Default Constructor");
	}

	public Teacher(String name, String city, byte age) {
		super(name, city, age);
		System.out.println("Teacher : Parameterized Constructor");
		//super(name, city, age); //not allowed here always first statement of constructor

	}

	public Teacher(String name, String city, byte age, String qualification, String subject, int exp) {
		super(name, city, age);
		this.qualification = qualification;
		this.subject = subject;
		this.exp = exp;
		System.out.println("Teacher : Parameterized Constructor");
	}

	public void show() {
		//super(); //allow in constructor only 
		super.show();
		System.out.println("Qualification : " + qualification + ", Subject : " + subject + ", Experience : " + exp);
	}
}
