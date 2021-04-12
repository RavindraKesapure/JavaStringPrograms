package com.String;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {

		String a="ratastructure";
		 char[] charArr = a.toCharArray();
		 for (int i = 0; i< charArr.length; i++) {
	            int count = 0;
	            for (int j = 0; j< charArr.length; j++) {
	                if (charArr[i] == charArr[j]) {
	                    count++;
	                }
	            }
	            if (count == 1){
	                System.out.println("First Non Repeating Character is: " + charArr[i]);
	                break;
	            }
	        }
	}

}
