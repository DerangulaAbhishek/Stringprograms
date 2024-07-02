package com.kn.romancharacters;

import java.util.Scanner;

public class RomanNumbersDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//Take a number to convert into roman numbers
		System.out.println("Enter a number");
		int num=s.nextInt();
		//create a object for the class RomanNumbers
		RomanNumbers output=new RomanNumbers();
		
		//Call the method convert_numbers_to_Roman_Numbers
		System.out.println(output.convert_numbers_to_Roman_Numbers(num));
		
		//Release the resource
		s.close();
	}
}
