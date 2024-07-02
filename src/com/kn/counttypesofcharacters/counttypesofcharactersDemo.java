package com.kn.counttypesofcharacters;

import java.util.Scanner;

public class counttypesofcharactersDemo {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		//Take input String From the User
		System.out.println("Enter the String  to count th types of Characters");
		String inputstring=s.nextLine();
		
		
		//Create object for the class counttypesofcharacters
		counttypesofcharacters output=new counttypesofcharacters();
		
		//Call the method 
		output.countcharacterstypes(inputstring);
		
		//Release the Source
		s.close();
		
		
		
	}

}
