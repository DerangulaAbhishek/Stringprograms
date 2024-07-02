package com.kn.dulpicates;

import java.util.Scanner;

public class removeduplicatesDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String to Remove duplicates from to string");
		
		//Take input from the user
		String inputstring=s.nextLine();
		
		
		//Create object for the class duplicatesremovedfromthestring
		duplicatesremovedfromthestring outputstring=new duplicatesremovedfromthestring();
		//Call the method and traverse 
		System.out.println(" Duplicates Removed :- "+outputstring.duplicatesremove(inputstring));
		//RELEASEDE THE RESOURCE
		s.close();
		
	}

}
