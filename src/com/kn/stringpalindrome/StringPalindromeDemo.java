package com.kn.stringpalindrome;

import java.util.Scanner;

public class StringPalindromeDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Take a input string from the user
		System.out.println("Enter a String whether the String is Palindrome or Not");
		String inputstring=sc.nextLine();
		
		//Create a object for the class StringPalindrome
		StringPalindrome palindrome=new StringPalindrome();
		
		//Call method tocheckstringispalindrome
		
		boolean outputstring=palindrome.tocheckstringispalindrome(inputstring);
		
		//Traverse the Output String 
		System.out.println(outputstring);
		
		sc.close();
		
		
	}

}
