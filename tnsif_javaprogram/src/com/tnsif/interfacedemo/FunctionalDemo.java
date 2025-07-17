package com.tnsif.interfacedemo;

public class FunctionalDemo {
	
	public static void main(String[] args) {
		
		GreetingDemo gd = () -> //labmda expression
		System.out.println("Hello Welcome to the java session");
		gd.greet();
		
		
	}

}
