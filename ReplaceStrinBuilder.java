package com.String;
// Java program to demonstrate 
// the replace() Method.
public class ReplaceStrinBuilder {
 
	    public static void main(String[] args) 
	    { 
	  
	        // create a StringBuilder object 
	        // with a String pass as parameter 
	        StringBuilder str 
	            = new StringBuilder("WelcomeGeeks"); 
	  
	        // print string 
	        System.out.println("String = "
	                           + str.toString()); 
	  
	        // replace Character from index 1 to 7 by "e are " 
	        StringBuilder strReturn = str.replace(1, 7, "e are "); 
	  
	        // print string 
	        System.out.println("After Replace() String = "
	                           + strReturn.toString()); 
	    } 
	} 
