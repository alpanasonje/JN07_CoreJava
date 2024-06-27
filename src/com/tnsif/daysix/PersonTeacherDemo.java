package com.tnsif.daysix;

public class PersonTeacherDemo {

	public static void main(String[] args) {
		Person pOne=new Person();
		pOne.show();
		System.out.println();
		Person pTwo=new Person("Mahesh", "Pune", (byte)37);
		pTwo.show();
		System.out.println("---------------------------------");
		
		Teacher tOne=new Teacher();
		tOne.show();
		System.out.println();
		Teacher tTwo=new Teacher("Alpana Sonje", "Nashik", (byte)45, "MCS", "CS", 18);
		tTwo.show();
	}

}
