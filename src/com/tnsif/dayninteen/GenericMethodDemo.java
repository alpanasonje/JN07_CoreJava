package com.tnsif.dayninteen;

public class GenericMethodDemo {

	public static void main(String[] args) {
		PalindromeClass obj=new PalindromeClass();
		obj.display(10);
		obj.display("PVG");
		obj.display(true);
		obj.display(45.60);
		
		
		System.out.println("is 10 palindrome? : "+obj.checkPalindrome(10));
		System.out.println("is 101 palindrome? : "+obj.checkPalindrome(101));
		
		System.out.println("is CAR palindrome? : "+obj.checkPalindrome("CAR"));
		System.out.println("is RACECAR palindrome? : "+obj.checkPalindrome("RACECAR"));
	
		obj.checkPalindrome(45.678);
	}
}
