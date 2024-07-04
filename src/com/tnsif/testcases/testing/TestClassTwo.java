package com.tnsif.testcases.testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import com.tnsif.testcases.businesslogic.Operations;

public class TestClassTwo {

	@TestFactory
	public DynamicTest testMethod()
	{
		return DynamicTest.dynamicTest("First Dynamic Test",()->{Assertions.assertTrue(Operations.isPalindrome(121));});
	}
	
	@TestFactory
	public List<DynamicTest> testMethodTwo()
	{
		return Arrays.asList(DynamicTest.dynamicTest("TestForNull", ()->{Assertions.assertNull(null);}),
				DynamicTest.dynamicTest("TestForPrime", ()->Assertions.assertTrue(Operations.isPrime(4))),
				DynamicTest.dynamicTest("TestForFactorial", ()->Assertions.assertEquals(24, Operations.getFactorial(4))),
				DynamicTest.dynamicTest("TestForFalse", ()->{Assertions.assertFalse(12>50);}));		
	}
}
