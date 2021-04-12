package com.String;

public class PairOfSumArray {

	static void printPair(int arr[],int n,int sum)
	{
		for(int i=0; i<n; i++)
			for(int j=i; j<n; j++)
				if(arr[i]+arr[j]==sum)
				
					System.out.println("("+arr[i]+","+arr[j]+")");
	}
	public static void main(String[] args) {
	
		int arr[]= {1,6,8,-1,5,3,9,2,0};
		int n= arr.length;
		int sum = 8;
		
		printPair(arr,n,sum);

	}

}
