package com.sapient.training.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class MyClassTest {

	
	@Test
	public void testAddValid() {
		MyClass myClass= new MyClass();
		assertEquals("Valid data",5.0,myClass.add(2.0, 3.0),0.1);
	}
	
	@Test
	public void testAddInValid() {
		MyClass myClass= new MyClass();
		assertFalse("InValid data",myClass.add(2.0, 3.0)==6.0);
	}
	
	
}
