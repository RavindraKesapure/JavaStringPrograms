package com.String;

public class CharArray1 {

	public static void main(String[] args) {

		// Java program to Convert a String 
		// to a Character array using toCharArray() 
		
		String str="Ravindra";
		
		 char ch[]= str.toCharArray();
		
		for(char c: ch)
		{
			System.out.println(c);
		}
	}

}
