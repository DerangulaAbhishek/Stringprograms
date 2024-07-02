package com.kn.stringpalindrome;

public class StringPalindrome {
	//Method to Check the the String the Palindrome or not 
	public boolean tocheckstringispalindrome(String inputstring)
	{
		StringBuffer bufferedstring=new StringBuffer();
		char[] crr=inputstring.toCharArray();
		for(int i=crr.length-1;i>=0;i--)
		{
			bufferedstring=bufferedstring.append(crr[i]);
			
		}
		String buffer=bufferedstring.toString();
		if(buffer.equals(inputstring))
		{
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is Not a Palindrome ");
		}
		return true;
	}

}
