package com.tnsif.testcases.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.tnsif.testcases.businesslogic.Operations;

public class MyTestClass {
	@Test	
	public void testAddition()
	{
		System.out.println("Addition Testing");
		int expected=7;
		int actual=Operations.add(2, 5);
		Assertions.assertEquals(expected, actual);
	}
	@Test
	public void testFacorial()
	{
		System.out.println("factorial Testing");
		long expected=5040;
		long actual=Operations.getFactorial(7);
		Assertions.assertEquals(expected, actual);
	}
	@Test
	public void testFacorialForZero()
	{
		System.out.println("factorial Testing");
		long expected=1;
		long actual=Operations.getFactorial(0);
		Assertions.assertEquals(expected, actual);
	}
	@Test
	public void testFacorialForNegativeNumbers()
	{
		System.out.println("factorial Testing");
		long expected=-1;
		long actual=Operations.getFactorial(-2);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void testForPrime()
	{
		Assertions.assertTrue(Operations.isPrime(5));
	}
	
	@Test
	public void testForNonPrime()
	{
		Assertions.assertFalse(Operations.isPrime(9));
	}
	
	@Test
	public void testForNumberPalindrome()
	{
		Assertions.assertTrue(Operations.isPalindrome(12521));
	}
	
	@Test
	public void testForNumberNonPalindrome()
	{
		Assertions.assertFalse(Operations.isPalindrome(129));
	}
	
	@Test
	public void testForStringPalindrome()
	{
		Assertions.assertTrue(Operations.isPalindrome("RACECAR"));
	}
	
	@Test
	public void testForStringNonPalindrome()
	{
		Assertions.assertFalse(Operations.isPalindrome("CAR"));
	}
	
}


