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
		
		int sit1 = 0;
		int sit2 = 0;
		int start1 = start;
		int end1 = mediana-1;
		int start2 = mediana+1;
		int end2 = end;
		
		if(arr[start1]<=arr[end1]) {
			if(target>=arr[start1] && target <=arr[end1]) {
				sit1 = 1;
			} else {
				sit1 = 2;
			}
		} else {
			sit1 = 3;
		}
		
		if(arr[start2]<=arr[end2]) {
			if(target>=arr[start2] && target <=arr[end2]) {
				sit2 = 1;
			} else {
				sit2 = 2;
			}
		} else {
			sit2 = 3;
		}
		
		if(sit1==1) {
			return binarySearch(arr, target, start1, end1);
		}  else if(sit2==1){
			return binarySearch(arr, target, start2, end2);
		} else if(sit1==3) {
			return searchArray(arr,target, start1, end1);
		}else if(sit2==3) {
			return searchArray(arr,target, start2, end2);
		} else {
			return -1;
		}
		
	}

	public static void main(String[] args) {
		int arr1[] = new int[] { 6,7,1,2,3,4,5};
		int arr2[] = new int[] { 5,6,7,1,2,3,4};
		int arr3[] = new int[] { 4,5,6,7,1,2,3};
		int arr4[] = new int[] { 3,4,5,6,7,1,2};
		int arr5[] = new int[] { 2,3,4,5,6,7,1};
		int arr6[] = new int[] { 1,2,3,4,5,6,7};
		int arr7[] = new int[] { 7,1,2,3,4,5,6};
		
		System.out.println(searchArray(arr1, 4, 0, arr1.length - 1));
		System.out.println(searchArray(arr2, 4, 0, arr2.length - 1));
		System.out.println(searchArray(arr3, 4, 0, arr3.length - 1));
		System.out.println(searchArray(arr4, 4, 0, arr4.length - 1));
		System.out.println(searchArray(arr5, 4, 0, arr5.length - 1));
		System.out.println(searchArray(arr6, 4, 0, arr6.length - 1));
		System.out.println(searchArray(arr7, 4, 0, arr7.length - 1));
//		
//		System.out.println(1/2);
	}

}
