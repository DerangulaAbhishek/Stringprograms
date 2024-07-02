package com.kn.counttypesofcharacters;
public class counttypesofcharacters
{
	//Method to count types of Characters
	public void countcharacterstypes(String inputstring)
	{
		char[] crr=inputstring.toCharArray();
		int uvowels=0;
		int uconsonent=0;
		int lvowels=0;
		int lconsonent=0;
		int digit=0;
		int space=0;
		int special=0;
		for(int i=0;i<crr.length;i++)
		{
			if((int)crr[i]>=65&&crr[i]<=90)
			{
				
				if((int)crr[i]==65||(int)crr[i]==69||(int)crr[i]==73||(int)crr[i]==79||(int)crr[i]==85)
				{
					 uvowels++;
				}
				else {
					uconsonent++;
				}
			}
			else if((int)crr[i]>=97&&(int)crr[i]<=122)
			{
				if((int)crr[i]==97||(int)crr[i]==101||(int)crr[i]==105||(int)crr[i]==111||(int)crr[i]==117)
				{
					lvowels++;
				}else
				{
					lconsonent++;
				}
			}
			else if(crr[i]>=48||crr[i]<=57)
			{
				digit++;
			}
			else if(crr[i]==32)
			{
				space++;
			}
			else {
				special++;
			}
		}
		System.out.println("Upper Case Vowels = "+uvowels);
		System.out.println("Upper Case Consonents= "+uconsonent);
		System.out.println("Lower Case Vowels = "+uvowels);
		System.out.println("Lower Case Consonents = "+uconsonent);
		System.out.println("Digits = "+digit);
		System.out.println("Spaces = "+space);
		System.out.println("Special Characters = "+space);
		
	}
}