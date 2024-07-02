package com.kn.longestword;

public class longestword {
	// Mathod to find out the longest word in String
	public String findlargestword(String inputstring)
	{
		String[] srr=inputstring.split(" ");
		String temp="";
		for(String s:srr)
		{
			if(s.length()>temp.length())
			{
				temp=s;
			}
		}
		
		
		
		
		return temp;
	}

}
