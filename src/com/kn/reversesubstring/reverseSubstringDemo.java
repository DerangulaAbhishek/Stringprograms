package com.kn.reversesubstring;

import java.util.Scanner;

public class reverseSubstringDemo {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		//Take input string from the user
		
		System.out.println("Enter a string to reverse a substring : ");
		String inputstring=s.nextLine();
		
		//Create the object for the class reverseSubstring
		reverseSubstring outputstring=new reverseSubstring();
		
		//Call the method reversesubstring
		outputstring.reversesubstring(inputstring);
		
		
		//Release the resource
		s.close();
		
		
	}

}
