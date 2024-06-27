package com.tnsif.daysixteen;

public class StringDemo {

	public static void main(String[] args) {
		String s1="Hello"; //Literal - allocates on string pool
		String s2="Hello"; //Literal - points to the same area on string pool
		String s3=new String("Hello"); //allocates on Heap
		
		System.out.println("Is s1==s2? "+(s1==s2));
		System.out.println("Is s1==s3? "+(s1==s3));
		System.out.println("s1.equals(s2)? "+s1.equals(s2));
		System.out.println("s1.equals(s3)? "+s1.equals(s3));
		
		String s4=s1; //Points to the same area on string pool
		System.out.println("Is s1==s4? "+(s1==s4));
		System.out.println("s1.equals(s4)? "+s1.equals(s4));
		
		String s5=new String("Hello"); //allocates another memory on Heap
		System.out.println("Is s3==s5? "+(s5==s3));
		System.out.println("s3.equals(s5)? "+s3.equals(s5));
		
		String s6=s3; //points to the same area on heap (s3)
		System.out.println("Is s6==s3? "+(s6==s3));
		System.out.println("s6.equals(s3)? "+s6.equals(s3));
		
		String s7=s3.intern(); //points to the same area on string pool where Hello is stored
		System.out.println("Is s7==s3? "+(s7==s3));
		System.out.println("s7.equals(s3)? "+s7.equals(s3));
		System.out.println("Is s7==s1? "+(s7==s1));
		
		String s8=new String("Hi"); //allocates new memory on heap
		String s9=s8.intern(); //allocates new memory on string pool 
		System.out.println("Is s8==s9? "+(s8==s9));
		
		

	}

}
