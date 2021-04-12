package com.String;

public class ReplcaeCharecter {
  
    public static void main(String args[]) 
    { 
  
        // Get the String 
        String str = "Geeks Gor Geeks"; 
  
        // Get the index 
        int index = 6; 
  
        // Get the character 
        char ch = 'F'; 
  
        // Print the original string 
        System.out.println("Original String = "
                           + str); 
  
        StringBuilder string = new StringBuilder(str); 
        string.setCharAt(index, ch); 
  
        // Print the modified string 
        System.out.println("Modified String = "
                           + string); 
    } 
} 
