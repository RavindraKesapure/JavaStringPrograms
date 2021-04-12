package com.String;

public class FirstUniqueChar {

	public static void main(String[] args) {
		 String str="gibblegabbler";
		   char[] ch=str.toCharArray();
		   
		   for(int i=0; i<str.length(); i++)
		   {
			   boolean unique=true;
			   for(int j=i+1; j<str.length(); j++)
			   {
				 if(ch[i]==ch[j])
				 {
					 unique = false;
				 }
			   }
			   
			   if(unique)
			   {
				   System.out.println(ch[i]);
				   break;
				   
			   }
		   } 
	}

}
