package com.kn.countcharactersinstring;

public class countCharacters
{
	//Method to count Characters in Array 
	public void countCharactersArrayinString(String inputstring)
	{
		char[] crr=inputstring.toCharArray();
		sortArray(crr);
		int count=1;
		for(int i=0;i<crr.length;i++)
		{
			
			for(int j=0;j<crr.length-1;j++)
			{
				if(crr[j]==crr[j+1])
				{
					count++;
				}
				else {
					
					System.out.println(crr[j]+" --> "+count);
					count=1;
					}
				 
				if(crr.length-1==j+1)
				{
					if(crr[j+1]==crr[j])
					{
						count++;
					}
					else
					{
					count=1;
					System.out.println(crr[j+1]+" --> "+count);
					}
				}
				
					
				
			}
		}


	}

	public char[] sortArray(char[] crr) {
		// Method to do sort
		for(int i=0;i<crr.length-1;i++)
		{
			char temp1=0;
			for(int j=0;j<crr.length-1-i;j++)
			{
					if(crr[j]>crr[j+1])
					{
						 temp1=crr[j];
						crr[j]=crr[j+1];
						crr[j+1]=temp1;
					}

				}
			}
				
		
		
		
		return crr;
		
	}
}