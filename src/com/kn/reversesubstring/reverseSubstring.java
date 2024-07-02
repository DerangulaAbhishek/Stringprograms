package com.kn.reversesubstring;


public class reverseSubstring{
	
	//Method to reverse a substring in a given String
	public void reversesubstring(String inputstring)
	{
		
		//Convert the given string into string Array(substring) by using the split() method
		
		String []srr=inputstring.split(" ");
		
		for(int i=0;i<srr.length;i++)
		{
			//convert the substring into characters Array and reverse the sequence of Array
			
			char [] crr=srr[i].toCharArray();
			for(int j=crr.length-1;j>=0;j--)
			{
				System.out.print(crr[j]);
			}
			System.out.print(" ");
			
		}
		
		
		
		
	}
	
}