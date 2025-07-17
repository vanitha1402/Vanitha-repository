package com.tnsif.wrapperclass;

public class WrapperClassDemo {

	public static void main(String[] args) {
		
		//wrapper class - used to convert primitive data types to objects 
		//and vice versa
		
		//autoboxing or boxing
		//unboxing
		
		int x = 5;
		
		//autoboxing
		Integer y = Integer.valueOf(x);
		
		//unboxing
		int z = y;
		
		System.out.println(y + " "+ z);
		
	}

}
