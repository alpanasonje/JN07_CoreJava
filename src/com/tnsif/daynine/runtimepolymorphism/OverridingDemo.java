package com.tnsif.daynine.runtimepolymorphism;

public class OverridingDemo {

	public static void main(String[] args) {
		ClassA obj;
		
		obj=new ClassA();
		obj.setN(10);
		obj.show(); //show() of ClassA
		
		/*
		 * obj=new ClassB(); obj.setN(20); obj.show(); //show() of ClassB
		 */
		
		ClassB bObj=new ClassB();
		bObj.setName("PVG Students");
		bObj.show();
		
		Person pObj;
		
		pObj=new Person("Aniket", "Pune");
		System.out.println(pObj);
		
		pObj=new Student(101, "BE", "Pooja", "Mumbai");
		System.out.println(pObj);
				
	}

}
