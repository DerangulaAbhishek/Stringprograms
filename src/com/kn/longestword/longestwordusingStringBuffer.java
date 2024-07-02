package com.kn.longestword;

public class longestwordusingStringBuffer {
	// Mathod to find out the longest word in String using StringBuffer

	public String findlargestword(String inputstring)
	{
		String[] srr=inputstring.split(" ");
		StringBuffer temp=new StringBuffer();
		for(String s:srr)
		{
			if(s.length()>temp.length())
			{
				temp=new StringBuffer();
			}
		}
		
		
	
		
		return temp.toString();
	}
}
