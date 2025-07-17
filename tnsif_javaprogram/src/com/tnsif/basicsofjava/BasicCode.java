package com.tnsif.basicsofjava;

public class BasicCode {

	public static void main(String[] args) {


		//Identifiers - age , salary, isPassed & grade
		
		int age = 21;
		double salary = 50000.00;
		boolean isPassed = true;
		char grade = 'A';
		
		//Type Casting 
		
		double newAge = age; //implicit type casting or internal
		int newSalary = (int) salary;//explicit type casting or external
		
		
		//Arithmetic operation
		
		int bonus = 6000;
		int total = bonus + newSalary;
		
		System.out.println(age);
		System.out.println(salary);
		System.out.println(newSalary);
		System.out.println(total);
		
		//if else condition
		
		if(isPassed && grade == 'A')
		{
			System.out.println("Excellent Performance");
		} else {
			System.out.println("Needs Improvement");
		}
		
		//switch case
		
		switch(grade)
		{
		case 'A':
			System.out.println("Grade A");
			break;
		
		case 'B':
			System.out.println("Grade B");
			break;
		
		default:
			System.out.println("Other Grade");
			break;
	}
		

		
	}
}

