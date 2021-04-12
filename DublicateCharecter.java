package com.String;

public class DublicateCharecter {

	public static void main(String[] args) {

		String str="ravindrakesapure";
		char[] ch=str.toCharArray();
		int len=str.length();
		
		for(int i=0; i<len; i++)
		{
			for(int j=i+1; j<len; j++)
			{
				if(ch[i]==ch[j] && (i!=j))
				{
					System.out.println(ch[i]);
				}
			}
		}
		
		
	}

}
