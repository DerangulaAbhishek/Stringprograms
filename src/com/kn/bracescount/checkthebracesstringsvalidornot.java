package com.kn.bracescount;


	class bracess
	{
		//Method to check the string is valid or not
		public void checkthestring(String inputstring)
		{
			char[]crr=inputstring.toCharArray();
			int paranthesis=0;
			int curly=0;
			int square=0;
			
			for(int i=0;i<crr.length;i++)
			{
				if(crr[i]=='{')
					{
					paranthesis++;				
					}
				else if(crr[i]=='}')
				{
					paranthesis--;
				}
				if(crr[i]=='[')
				{
				curly++;				
				}
			else if(crr[i]==']')
			{
				curly--;
			}
				if(crr[i]=='(')
				{
				square++;				
				}
			else if(crr[i]==')')
			{
				square--;
			}
				
			}
			if(paranthesis==0&&curly==0&&square==0)
			{
				System.out.println("String is Valid");
			}
			else {
				System.out.println("String is invalid");
			}
		}
	
	
	}