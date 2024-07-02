package com.kn.longestword;

import java.util.Scanner;

public class longestwordusingStringBufferDemo {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		//Take input from the user
		System.out.println("Enter a string : ");
		String inputstring=s.nextLine();
		
		//Create object for the class longest word
		longestword outputstring=new longestword();
		
		//Call the method and travers
		System.out.println("Longest word in a given string = "+outputstring.findlargestword(inputstring));
		
		//Release the resource
		s.close();

	}

}
/*
 
Output :-
Enter a string : 
My Name is Abhishek
Longest word in a given string = Abhishek

*/
