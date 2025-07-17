package com.tnsif.packagesandaccessmodifiers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Country: ");
		String country = br.readLine();
		
		System.out.println("Pincode ");
		int pin = Integer.parseInt(br.readLine());
		
		System.out.println("Country name: " + country + ", Pin Code: " + pin);

	}

}