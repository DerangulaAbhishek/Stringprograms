package com.kn.reversestring;

public class reverseString {
	// Method to reverse a String
	public String reversingstring(String inputString)
	{
		StringBuffer bufferedstring=new StringBuffer();
		char[] crr=inputString.toCharArray();
		for(int i=crr.length-1;i>=0;i--)
		{
			bufferedstring=bufferedstring.append(crr[i]);
			
		}
		String buffer=bufferedstring.toString();
		
		return buffer;
		
	}
}
