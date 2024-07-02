package com.kn.replaceSpace;

import java.util.Scanner;


public class replacestringDemo {

	public static void main(String[] args) {
		//Take input from the user
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String ");
		String inputstring=s.nextLine();
		//Take input to change the character
		System.out.println("Enter a Character to replace with String ");
		char replacechar=s.next().charAt(0);
		
		System.out.println("Enter a character to replace");
		//create a object for the class replacestring
		replacestring outputstring=new replacestring();
		//Call the method 
		System.out.println(outputstring.replacestringwithsinglecharacter(inputstring, replacechar));
		//Relese the sourcce
		s.close();
	
	
	}
	

}
