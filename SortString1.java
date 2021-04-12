package com.String;

public class SortString1 {
	
	public static void bubbleSort( String[] arr ) {
	    int j = 0;
	    String tmp;
	/*    boolean sorted = false;
	    while ( !sorted ) {
	        sorted = true;  */
	    
	      for(j=0;j<arr.length;j++)
	      {
	       // j++;
	        for ( int i = j; i < arr.length-1-j; i++ ) {
	            if (arr[j].compareTo( arr[i ] ) > 0) {
	            	 System.out.println(arr[j]+" "+arr[i]);	
	            	//System.out.println((arr[i]));
	                tmp = arr[j];
	                arr[j] = arr[i];
	                arr[i] = tmp;
	               // sorted = false;
	            }
	        }
	    }
	}
	
	public static void main( String[] args ) {
	    String[] value = { "Banana", "Orange", "Cherry", "Apple", "Pineapple", "Melon", "Plum" };
	    bubbleSort( value );
	    
	    for ( String element : value ) 
	    {
	        System.out.println( element );
	    }
	}
	
}
