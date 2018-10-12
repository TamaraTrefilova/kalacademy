package com.toma.tutorial;

public class MaxSum {

	public static int maxSum(int arr[]) {
		int max = 0;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (sum < sum + arr[i]) {
				sum += arr[i];
			} else {
				sum = 0;
			}

			if (sum > max) {
				max = sum;
			}

		}
		return max;
	}

	public static void main(String[] args) {
		// int arr[] = new int[] { 0, -7, 5,-10, 2, 1, -1, 0, 10 };
		int arr[] = new int[] { 10, -1, -7, -5, 7,-1, 5,6,7, -1, 0, 5 };
		// int arr[] = new int[] {-100, -3, -7, -11,-10 , -1, };

		System.out.println(maxSum(arr));
	}

}
