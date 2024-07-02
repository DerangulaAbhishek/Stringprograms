package com.kn.reversestring;

import java.util.Scanner;


public class reversestring1Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Take input from the user
		System.out.println("Enter a string : ");
		String inputstring=sc.nextLine();
		//Create object for the class replacestring1
		reversestring_1 outputstring=new reversestring_1();
		//Call Method replacestring and Traverse 
		System.out.println(outputstring.reversestring(inputstring));
		//Release the source
		sc.close();
	
	}

}
