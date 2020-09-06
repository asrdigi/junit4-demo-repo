package com.sapient.training.service;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MyClassParameterizedTest {

	private double operand1;
	private double operand2;
	static MyClass myClass;
	
	/*public MyClassParameterizedTest(double operand1){
		this.operand1=operand1;		
	}*/
	
	public MyClassParameterizedTest(double operand1,double operand2){
		this.operand1=operand1;
		this.operand2=operand2;
	}
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		myClass= new MyClass();		
	}
	
	@Parameters
	public static Collection<Object[]> data() {
	    Object[][] data = new Object[][] { { 1.0,2.0 }, { 2.0,3.0 }, { 3.0,4.00 },{ 4.0,5.0 } };
	    return Arrays.asList(data);
	}
	  
	
	  @Test
		public void testMultiply() {				
			assertEquals("Testing Multiply method",operand1*operand2,myClass.multiply(operand1,operand2),0.01);
		}
		
		
		@Test
		public void testDivide() {			
			assertEquals("Testing Divide method",operand1/operand2,myClass.divide(operand1, operand2),0.01);
			
		}

		@Test
		public void testAdd() {			
			assertEquals("Testing add method",operand1+operand2,myClass.add(operand1, operand2),0.01);
		}  
		
		@Test
		public void testSquare(){
			assertEquals("Testing square method",operand1*operand1,myClass.square(operand1),0.01);
		}

}
