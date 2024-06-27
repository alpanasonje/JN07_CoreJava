package com.tnsif.dayninteen;

public class PalindromeClass<T> {
	// generic method
	<T> void display(T t) {
		System.out.println("You entered : " + t);
		System.out.println("Type is " + t.getClass());
	}

	// generic method
	boolean checkPalindrome(T t) {
		if (t.getClass().getName().equals("java.lang.String")) {
			String s = t.toString();
			return s.equals(new StringBuffer(s).reverse().toString());
		} else if (t.getClass().getName().equals("java.lang.Integer")) {
			int n = Integer.parseInt(t.toString());
			int n1 = n, rev = 0;
			while (n != 0) {
				rev = rev * 10 + n % 10;
				n = n / 10;
			}

			return n1 == rev;
		} else {
			System.out.println("Not a String or Integer ");
			return false;
		}
	}

}
