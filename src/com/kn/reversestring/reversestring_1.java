package com.kn.reversestring;

public class reversestring_1 {
	//Method to reverse a string 
	public String reversestring(String inputstring)
	{
		StringBuffer outputstring=new StringBuffer(inputstring);
		for(int i=outputstring.length()-1;i>=0;i--)
		{
			outputstring=outputstring.append(inputstring.charAt(i));
		}
		return outputstring.toString();
		
	}

}
