package com.toma.tutorial;

public class Duplicate {
	
	public static int findDuplicate(int arr[]) {
		
		int[] arrA = new int [arr.length];
		
		for(int i = 0; i<arr.length; i++) {
			if(arrA[arr[i]]==1) {
				return arr[i];
			} else {
				arrA[arr[i]]++;
			}
		}
		
		return -1;
	}
	
	
	public static void main(String[] args) {
		int arr[] = new int[] { 5,6,7,1,2,3,4,5,8};
		 System.out.println(findDuplicate(arr));
	}
}
