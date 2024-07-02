package com.kn.anagramstrings;

import java.util.Scanner;


public class AnagramSteingDemo {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
		
		//Take input from the user
		System.out.println("Enter a  first string : ");
		String inputstring1=s.nextLine();
		System.out.println("Enter a  second string : ");
		String inputstring2=s.nextLine();
		
		
		//Create object for the class longest word
		AnagramString outputstring=new AnagramString();
		
		//Call the method and travers
		boolean anagram=outputstring.tochecktheAnagramString(inputstring1, inputstring2);
		if(anagram) {
			System.out.println(inputstring1+" and "+inputstring2+" are Anagram Stringa");
		}
		else
		{
			System.out.println(inputstring1+" and "+inputstring2+" are not  Anagram Stringa");
		}
		//Release the resource
		s.close();
		 

	}

}
