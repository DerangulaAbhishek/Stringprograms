package com.kn.replaceSpace;

public class replacestring {
	//Method to replace the string with the given character
	public String replacestringwithsinglecharacter(String stringinput,char string)
	{
		StringBuffer bufferedstring=new StringBuffer(stringinput);		
		for(int i=0;i<bufferedstring.length();i++)
		{
			if(bufferedstring.charAt(i)==' ')
			{
				bufferedstring.setCharAt(i, string);
			}
		}
		
		return  bufferedstring.toString();
		
	}
	

}
