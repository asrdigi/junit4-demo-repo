package com.sapient.training.service;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class MyAnotherClassTest {	
		
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("SetUpBeforeClass method executed");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass method executed");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before test method");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After test method");
	}
		
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testDivide(){
		assertEquals("Throws exception",5.0,new MyClass().divide(1.0,-1.0),0.01);
	}
	

}
