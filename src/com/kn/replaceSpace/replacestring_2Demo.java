package com.kn.replaceSpace;

import java.util.Scanner;

public class replacestring_2Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Take input string from the user
		System.out.println("Enter a string :");
		String inputstring=sc.nextLine();
		//Take a replace string from the user
//		System.out.println("Enter a string to replace with space");
//		String replacestring=sc.nextLine();
		//create a object for the class replacestring_2
		replacestring_2 outputstring=new replacestring_2();
		//Call the method  replacestringwithmultiplecharacters and traverse
		System.out.println(outputstring.replacestringwithmultiplecharacters(inputstring));
		// Release the resource
		sc.close();
	}

}
