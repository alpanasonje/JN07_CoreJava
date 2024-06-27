package com.tnsif.daysixteen;

public class StringFunctions {

	public static void main(String[] args) {
		String s = "Hello! How are you?";
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.startsWith("Hello"));
		System.out.println(s.endsWith("?"));
		System.out.println(s.charAt(7));
	//	System.out.println(s.charAt(70));
		System.out.println(s.indexOf("e"));
		System.out.println(s.lastIndexOf("e"));
		System.out.println(s.indexOf("z"));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.substring(7));
		System.out.println(s.substring(7, 10));
		System.out.println(s.contains("Hi"));
		System.out.println(s.replace("Hello", "Hi"));
		System.out.println(s);
		s=s.replace("Hello", "Hi");
		System.out.println(s);
		
	}

}
