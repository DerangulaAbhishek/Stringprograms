package com.kn.countcharactersinstring;

import java.util.Scanner;

public class countCharactersDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//Take a input String From the User
		System.out.println("Enter a string : ");
		String inputstring=s.nextLine();
		//Create object for the class countCharacters
		countCharacters outputstring=new countCharacters();
		
		//Call the method
		
		outputstring.countCharactersArrayinString(inputstring);
		//Release the resource
		s.close();
	}

}
