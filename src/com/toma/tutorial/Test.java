package com.toma.tutorial;

public class Test {

	
	public static void search(int [] arr, int start, int end) {
//		Check if the array is satisfy condition.
		if(arr.length%2==0) {
			System.out.println("The input is not valid");
			return;
		}
		
		if(start==end) {
			System.out.println(arr[start]);
			return;
		}
		int mediana = (start+end)/2;
		
		if(mediana%2==0 ) {
			if(arr[mediana]==arr[mediana-1]) {
				search(arr, start, mediana-2);
			} else {
				search(arr, mediana+2, end);
			}
		} else {
			if(arr[mediana]==arr[mediana+1]) {
				search(arr, start, mediana-1);
			} else {
				search(arr, mediana+1, end);
			}
		}
	}
	
	
	
	public static void main(String[] args) {
//		 int arr[] = new int[]{1,1,2,2, 4, 4, 5, 5, 7, 7, 8,8,10, 10};
//		int arr[] = new int[]{1,2,2, 4, 4, 5, 5, 7, 7, 8,8,10, 10};
//		int arr[] = new int[]{1,1,2,2, 3,4, 4, 5, 5, 7, 7, 8,8,10, 10};
		int arr[] = new int[]{1,1,2,2, 3,3,4, 4, 5, 5, 8,8, 10};
		 search(arr,0, arr.length-1);
		
//		System.out.println(11/2);
	}

}
