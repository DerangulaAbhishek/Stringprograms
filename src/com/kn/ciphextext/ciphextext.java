package com.kn.ciphextext;

public class ciphextext
{
	// Method to Change the given string into Ciphex String
	public String stringtociphextext(String inputstring,int value)
	{
		
		while(value>26)
		{
			value=value-26;
		}
		char [] crr=inputstring.toCharArray();
		for(int i=0;i<crr.length;i++)
		{
			if((crr[i]>=65&&crr[i]<=90-value)||(crr[i]>=97&&crr[i]<=122-value))
			{
				crr[i]=(char) (crr[i]+value);
			}
			else
			{
				crr[i]=(char)(crr[i]+value-26);
			}
		}
		String bufferedstring=new String(crr);
		
	
		
	
		return bufferedstring.toString();
		
	}
}