package com.toma.tutorial;

public class RotatedArray {

	public static int binarySearch(int arr[], int target, int start, int end) {
		int mediana = (start + end) / 2;
		if (target == arr[mediana]) {
			return mediana;
		}

		if (start <= end) {

			if (arr[mediana] > target) {
				return binarySearch(arr, target, start, mediana - 1);
			} else {
				return binarySearch(arr, target, mediana + 1, end);
			}

		}
		return -1;
	}

	public static int  searchArray(int arr[], int target, int start, int end) {
		int mediana = (start + end) / 2;
		if (target == arr[mediana]) {
			return mediana;
		}
		
		if(arr[mediana]> target) {
			if(arr[mediana]<arr[end] && arr[mediana] >arr[start]) {
				return binarySearch(arr, target, start, mediana-1);
			} else if(arr[mediana]<arr[start]) {
				return searchArray(arr, target, start, mediana-1);
			} else {
				return searchArray(arr, target, mediana+1, end);
			}
		} else if (arr[mediana]<target) {
			if(arr[end]>target) {
				return binarySearch(arr, target, mediana+1, end);
			} else if(arr[start]>arr[end]) {
				return searchArray(arr, target, start, mediana-1);
			} else {
				return searchArray(arr, target, mediana+1, end);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 6,7,1,2,3,4,5};
		System.out.println(searchArray(arr, 1, 0, arr.length - 1));
//		System.out.println(1/2);
	}

}
