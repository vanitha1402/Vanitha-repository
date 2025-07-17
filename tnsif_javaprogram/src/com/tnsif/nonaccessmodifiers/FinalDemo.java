package com.tnsif.nonaccessmodifiers;

class FinalDemo {
	
	final int Max = 100;
	
	void display() {
		System.out.println("Show the value of max:  "+Max);
	}

	public static void main(String[] args) {
		FinalDemo fd = new FinalDemo();
		fd.display();
		//fd.Max = 200;
		
	}

}

class Child extends FinalDemo{
	
	
	void display() {
		System.out.println("Show the value of max:  "+Max);
	}
}
