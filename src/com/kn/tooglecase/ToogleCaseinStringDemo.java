package com.kn.tooglecase;

import java.util.Scanner;

public class ToogleCaseinStringDemo {

	public static void main(String[] args) {
		

		Scanner s=new Scanner(System.in);
		//Take input string from the user
		
		System.out.println("Enter a string to Toogle of Characters : ");
		String inputstring=s.nextLine();
		
		//Create the object for the class reverseSubstring
		ToogleCaseinString outputstring=new ToogleCaseinString();
		
		//Call the method reversesubstring
		System.out.println(outputstring.toogleCaseCharacters(inputstring));
		
		
		//Release the resource
		s.close();

	}

}
