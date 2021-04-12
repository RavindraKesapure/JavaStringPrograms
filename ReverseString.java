package com.String;

public class ReverseString {

	public static void main(String[] args) {
		String n="Ravindra";   
	       char c[]=n.toCharArray();
	       int i=0,j=n.length()-1;
	       
	       while(i<j)
	       {
	    	   char temp=c[i];
	    	   c[i]=c[j];
	    	   c[j]=temp;
	    	   
	    	   i++;
	    	   j--;
	    	   
	       }
	    	
	       
	       for(char cc:c)
	       {
	    	   System.out.print(cc);
	       }

	}

}
