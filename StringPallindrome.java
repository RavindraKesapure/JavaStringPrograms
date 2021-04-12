package com.String;

import java.util.Scanner;

public class StringPallindrome {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String");
		String n=sc.nextLine();
		
		char[] rev=n.toCharArray();
		int len=n.length();
		int i=0,j=len-1;
		
		while(i<j)
		{
			char temp=rev[i];
			rev[i]=rev[j];
			rev[j]=temp;
			i++;
			j--;
		}		
		if(n.equals(String.valueOf(rev)))
		{
			System.out.println("String is pallindrome");
		}
		else
		{
			System.out.println("String is Not Pallindrome");
		}
	}

}
