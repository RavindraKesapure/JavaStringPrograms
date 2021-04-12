package com.String;

public class StringSorting {
	
	public static void bubbleSort( String[] arr ) {
	    int j = 0;
	    String tmp;
	    boolean sorted = false;
	    while ( !sorted ) {
	        sorted = true;
	        j++;
	        for ( int i = 0; i < arr.length - j; i++ ) {
	            if (arr[i].compareTo( arr[i + 1] ) > 0) {
	            	 //System.out.println(arr[i]+" "+arr[i+1]);   	
	            	//System.out.println((arr[i]));
	                tmp = arr[i];
	                arr[i] = arr[i + 1];
	                arr[i + 1] = tmp;
	                sorted = false;
	            }
	        }
	    }
	}
	public static void main( String[] args ) {
	    String[] value = { "Banana", "Orange", "Cherry", "Apple", "Pineapple", "Melon", "Plum" };
	    bubbleSort( value );
	    for ( String element : value ) {
	        System.out.println( element );
	    }
	}
	
}
