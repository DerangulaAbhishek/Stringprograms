package com.kn.ciphextext;

import java.util.Scanner;

public class ciphextextDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		//Take iput String from the user
		System.out.println("Enter the String : ");
		String inputstring=s.nextLine();
		
		System.out.println("Enter how many numbers to ciphex the string");
		int value=s.nextInt();
		
		//Create the object for the class ciphextext
		ciphextext outputstring=new ciphextext();
		
		//Call the method
		System.out.println(outputstring.stringtociphextext(inputstring, value));
		
		//Release the Resource
		s.close();
		
		
	}

}
