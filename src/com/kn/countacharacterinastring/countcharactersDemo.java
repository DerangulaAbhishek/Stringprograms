package com.kn.countacharacterinastring;

import java.util.Scanner;

public class countcharactersDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//Take input String from the user
		System.out.println("Enter a character : ");
		String inputstring=s.nextLine();
		//take inputcharacter from the user
		System.out.println("Enter a character : ");
		char character=s.next().charAt(0);
		//Create a object for the class
		countcharacter count= new countcharacter();
		//Call the method and treverse 
		System.out.println(count.countcharacterinstring(inputstring, character));
		//Relese the resource
		s.close();
		
	}

}
