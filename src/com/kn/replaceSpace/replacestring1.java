package com.kn.replaceSpace;



public class replacestring1 {
	public String replacestringanotherapproach(String inputstring,char replacechar)
	{
		
		char[] crr=inputstring.toCharArray();
		for(int i=0;i<crr.length;i++)
		{
			if(crr[i]==' ')
			{
				crr[i]=replacechar;
			}
			
		}
		String ca=new String(crr);
		return ca;
	}

}
