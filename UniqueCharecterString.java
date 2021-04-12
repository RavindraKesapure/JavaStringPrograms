package com.String;

import java.util.*;
public class UniqueCharecterString {

	boolean uniqueCharecters(String str)
	{
		for(int i=0; i<str.length(); i++)
			for(int j=i+1; j<str.length(); j++)
				if(str.charAt(i)==str.charAt(j))
					return false;
		
		return true;
		
	}
	
	public static void main(String[] args) {
		UniqueCharecterString obj=new UniqueCharecterString();
		
		String input="Ravindra";
		
		if(obj.uniqueCharecters(input))
			System.out.println("The String "+input +" All unique Charecters");
		else
			System.out.println("The String "+input +" Are Dublicate Charecters");
		  
		
	}

}
