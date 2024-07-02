package com.kn.printuniquecharacters;

public class toprintuniquecharacters {
	//Method to print Unique Characters
	public String printuniquecharacters(String inputstring)
	{
		char []crr=inputstring.toCharArray();
	//	StringBuffer buffer=new StringBuffer();
		
		for(int i=0;i<crr.length;i++)
		{
			int count=0;			
			for(int j=0;j<crr.length;j++)
			{
				if(i!=j)
				{
					
					if(crr[i]==crr[j])
					{
					
						count++;
					}
				}
				
			}
			if(count==0)
			{
				System.out.print(crr[i]);
			}		
		}
		return null;
	}

}
/*
public class Main {
public static void printUniqueCharacters(String input) {
    int[] charCount = new int[256]; // Assuming ASCII characters
    
    for (char c : input.toCharArray()) {
        int charValue = (int) c;
        charCount[charValue]++;
    }
    
    for (char c : input.toCharArray()) {
        int charValue = (int) c;
        if (charCount[charValue] == 1) {
            System.out.print(c + " ");
            charCount[charValue] = 0; // Avoid printing duplicates
        }
    }
    System.out.println();
}

public static void main(String[] args) {
    String input = "AASSDERTYUIOP";
    printUniqueCharacters(input);
}
}

*/