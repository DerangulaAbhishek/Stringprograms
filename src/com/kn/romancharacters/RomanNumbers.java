package com.kn.romancharacters;

public class RomanNumbers {
	
	public String convert_numbers_to_Roman_Numbers(int num)
	{
		int [] values= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] str= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		StringBuffer roman=new StringBuffer();
		for(int i=0;i<values.length;i++)
		{
			while(num>=values[i])
			{
				num=num-values[i];
				roman.append(str[i]);
			}
		}
		return roman.toString();
	}

}
