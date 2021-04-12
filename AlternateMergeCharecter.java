package com.String;

public class AlternateMergeCharecter {
	public static void main(String[] args) {

		AlternateMergeCharecter al=new AlternateMergeCharecter();
		char a[]={'a','b','c','d'};
		char b[]={'x','y','z','h','g'};
		char c[]=new char[a.length + b.length];
		int ch=0;
		
		for(int i=0; i<b.length; i++)
		{
			if(i < a.length )
			{
				c[ch++]=a[i];
			}
			if(i < b.length)
			{
				c[ch++]=b[i];
			}
		}
		for(int i=0; i<c.length; i++)
		{
			System.out.print(c[i]+",");
		}
	}

}
