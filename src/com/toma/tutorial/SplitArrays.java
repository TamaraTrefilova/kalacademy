package com.toma.tutorial;

public class SplitArrays {
	
	
	public static int splitArray (int arr[] ){
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum+=arr[i];
		}
		
		if (sum%2==0) {
			int[]first = new int [arr.length-1];
			for(int i = 0; i<arr.length; i++) {
				
				if(arr[i]!=sum/2) {
					first[i]=arr[i];
					arr[i]=0;
				} 
//				else {
//					arr[0]=arr[i];
//				}
			}
			printArray(arr); 
			printArray(first); 
			
		} else {
			return -1;
		}
		
		
		return -1;
	}

	private static void printArray(int []arr) {
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]!=0) {
				System.out.print(arr[i]+" ");
			}	
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = new int[] {5,5,5,5, 20, 10, 50 };
		 splitArray ( arr );
	}

}
