package com.kn.bracescount;

import java.util.Scanner;

public class checkthebracesstringisvalidornotDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		//Take input string from the user
		System.out.println("Enter a String : ");
		String inputstring=s.nextLine();
		
		//Create a object for the clas 
		bracess output=new bracess();
		output.checkthestring(inputstring);
		s.close();
	}

}
