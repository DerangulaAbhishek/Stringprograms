package com.kn.countacharacterinastring;

public class countcharacter {
	//Method to count the character from the String
	public int countcharacterinstring(String inputstring,char character)
	{
		char [] crr=inputstring.toCharArray();
		int count=0;
		for(int i=0;i<crr.length;i++)
		{
			if(crr[i]==character)
			{
				
				count++;
			}
		}
		return count;
	}

}
