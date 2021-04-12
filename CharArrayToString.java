package com.String;

public class CharArrayToString {

	public static void main(String[] args) {
		
		String str="";
		
		char [] chrArr= new char[]{'H','e','l','l','o'};
		
		str= new String(chrArr);
		
		System.out.println("Str :" + str);
	}

}
