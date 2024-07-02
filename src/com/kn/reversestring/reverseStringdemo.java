package com.kn.reversestring;

import java.util.Scanner;

public class reverseStringdemo {

	public static void main(String[] args) {
		//Take Input String From the user
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String");
		String inputstring=s.nextLine();	
		//Create a object for the class reverseString
		reverseString reversedString=new reverseString();
		//Call method reversingstring and Traversing 
		
		String outputstring=reversedString.reversingstring(inputstring);
		//Traversing the Output String
		System.out.println(outputstring);
		s.close();
	}

}
