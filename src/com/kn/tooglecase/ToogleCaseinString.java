package com.kn.tooglecase;
public class ToogleCaseinString
{
	//Method to change the ToogleCse Characters in String
	
	public String toogleCaseCharacters(String inputstring)
	{
		//Convert the given String into the Characters Array
		char [] crr=inputstring.toCharArray();
		for(int i=0;i<crr.length;i++)
		{
			//Unicodes or ( a - z )= (97-122) and ( A - Z )= ( 65 - 90 )
			if(crr[i]>=65&&crr[i]<=90)
			{
				crr[i]=(char)(crr[i]+32);
			}
			else if(crr[i]>=97&&crr[i]<=122)
			{
				crr[i]=(char)(crr[i]-32);
			}
		}
		StringBuffer bufferedstring=new StringBuffer();
		for(char c:crr)
		{
			bufferedstring.append(c);
		}
		
		
		
		
		return bufferedstring.toString();
	}
	
}