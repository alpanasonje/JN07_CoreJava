package com.tnsif.testcases.testing;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

//@TestInstance(Lifecycle.PER_METHOD) by Default
@Disabled
@TestInstance(Lifecycle.PER_CLASS)
public class LifeCycleTestClass {
	
	@RepeatedTest(3)
	//@Test
	public void testMethodOne() {
		System.out.println("This is Test Method One : " + this);
	}

	@Disabled
	@Test
	public void testMethodTwo() {
		System.out.println("This is Test Method Two : " + this);
	}

	@BeforeAll
	//public static void beforeAllLifeCycleMethod() {
	public void beforeAllLifeCycleMethod() {
		System.out.println("Before All");
	}

	@AfterAll
	//public static void afterAllLifeCycleMethod() {
	public void afterAllLifeCycleMethod() {
		System.out.println("After All");
	}

	@BeforeEach
	public void beforeEachLifeCycleMethod() {
		System.out.println("Before Each");
	}

	@AfterEach
	public void afterEachLifeCycleMethod() {
		System.out.println("After Each");
	}

}
