package com.kn.anagramstrings;

public class AnagramString {
	// Method to Check the The string is Anagram String or Not
	public boolean tochecktheAnagramString(String inputString1, String inputString2) {
		boolean isAnagram = false;
		if (inputString1.length() == inputString2.length()) {
			char[] crr1 = inputString1.toCharArray();
			char[] crr2 = inputString2.toCharArray();
//		crr1=sortCharArray1(crr1);
//		crr2=sortCharArray1(crr2);

			for (int i = 0; i < crr1.length; i++) {
				for (int j = 0; j < crr1.length; j++) {

					if (crr1[i] == crr2[j]) {
						isAnagram = true;
					} else {
						isAnagram = false;
					}
				}
			}

		}
		return isAnagram;

	}

//	
//	public char [] sortCharArray1(char [] crr)
//	{
//	
//		for(int i=0;i<crr.length-1;i++)
//		{
//			char temp=0;
//			for(int j=0;j<crr.length-1-i;j++)
//			{
//				if(crr[j]>crr[j+1])
//					{
//						temp=crr[j];
//						crr[j]=crr[j+1];
//						crr[j+1]=temp;
//					}
//			}
//	}
//	return crr;
//	}
//	

}