package com.String;

public class PalindromeString {

	public static void main(String[] args) {
		String s="hhhsusushhh";
	    
    	char c[]=s.toCharArray();
    	int i=0,j=s.length()-1;
    	
    	while(i<j)
    	{
    		char p=c[i];
    		c[i]=c[j];
    		c[j]=p;
    		
    		i++;
    		j--;
    	}
    	
    	String b=new String(c);
    	
    	if(s.equals(b))
    	{
    		System.out.println("String is Pallindrome ");
    	}
    	else
    	{
    		System.out.println("String is Not Pollindrome");
    	}
    	
    	
	}

}
