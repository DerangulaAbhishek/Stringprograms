package com.kn.printuniquecharacters;

import java.util.Scanner;

public class toprintuniquecharactersDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//Take input string from the user
		System.out.println("Enter a String from the user to print unique characters");
		String inputstring=s.nextLine();
		//Create object for the class toprontuniquecharacter
		toprintuniquecharacters outputstring=new toprintuniquecharacters();
		//Call the method and 
		outputstring.printuniquecharacters(inputstring);
		//release the resource
		s.close();
		
		
	}

}
