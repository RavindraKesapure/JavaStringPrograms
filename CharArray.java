package com.String;

import java.util.*;

public class CharArray {

	public static void main(String[] args) {
		
		// Java program to Convert a String 
		// to a Character array using Naive Approach 
		
		 String str="Ravindra";
		 
		 char[] ch=new char[str.length()];
		 
		 for(int i=0; i<str.length(); i++)
		 {
			 ch[i]=str.charAt(i);
		 }
		 
		 for(char c: ch)
		 {
			 System.out.println(c);
		 }
		 
	}

}
