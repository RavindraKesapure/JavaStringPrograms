package com.String;

public class AnagramString {

	public static void main(String[] args) {

		String a="jeeet";
		String b="teeee";
		int found=0;
		boolean visit[]=new boolean[b.length()];
		
		for(int i=0; i<a.length(); i++)
		{
			char []aa=a.toCharArray();
			for(int j=0; j<b.length(); j++)
			{
				char []bb=b.toCharArray();
				
				if(bb[j]==aa[i] && !visit[j])
				{
					visit[j]=true;
					found++;
					break;
				}
			}
		}
		
		if(found==a.length())
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
		
	}

}
