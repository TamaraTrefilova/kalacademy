package com.toma.tutorial;

public class FindNumber {
	
	
	public static int findNumber(int[]arr, int x) {
		
		for(int i = 0; i< arr.length-1; i++) {
			if(x == arr[i]) {
				if((arr[i-1]-arr[i]==1 ||arr[i-1]-arr[i]== -1) && 
						(arr[i+1]-arr[i]==1 ||arr[i+1]-arr[i]== -1)) {
					return i;
				}
			}
		}
		
		
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = new int[] {8, 7, 6, 7, 6, 5, 5, 4, 3, 2, 3, 4, 3};
		 System.out.println(findNumber(arr,5));
		 
	}

}
