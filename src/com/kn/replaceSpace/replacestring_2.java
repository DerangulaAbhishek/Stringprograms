package com.kn.replaceSpace;

public class replacestring_2 {
	//Method to replace the string with multiple characters
	public String replacestringwithmultiplecharacters(String inputstring)
	{
		for(int i=0;i<inputstring.length();i++)
		{
			if(inputstring.charAt(i)==' ')
			{
				inputstring.replace(" " , "99");
			}
		}
		return inputstring.toString();
	}
	

}
