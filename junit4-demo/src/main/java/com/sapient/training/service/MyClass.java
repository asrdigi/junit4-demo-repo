package com.sapient.training.service;

public class MyClass {
	public double multiply(double x,double y){
		if(x>999){
		throw new IllegalArgumentException("x should be less than 1000");
		}
		return x*y;
		}
	
	public double divide(double x,double y){
		
		if(x<0 || y<0){
			throw new IllegalArgumentException("Invalid arguments");
		}
		return x/y;
	}
	
	public double add(double x,double y){
		return (x+y);
	}
	
	public double substract(double x,double y){
		return (x-y);
	}
	
	public double square(double x){
		return x*x;
	}

}
