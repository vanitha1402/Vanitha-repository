package com.tnsif.packagesandaccessmodifiers;

import java.util.Scanner;

public class ScannerClassExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter college name: ");
		String cname = sc.nextLine();
		
		System.out.println("Enter college code: ");
		int code = sc.nextInt();
		
		System.out.println("The college name is: " + cname + ", The college code is: " + code);
		

	}

}
