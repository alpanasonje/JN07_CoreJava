package com.tnsif.daynine.covariantoverriding;

public class Demo {

	public static void main(String[] args) {
		
		ClassC c=new ClassC();
		System.out.println(c.getObject());
		System.out.println(c.getType());
		
		c=new ClassD();
		System.out.println(c.getObject());
		System.out.println(c.getType());
		
		

	}

}
