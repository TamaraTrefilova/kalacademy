package com.toma.tutorial;

import java.util.Stack;

public class EvaluateExpression {
	
	
	public static int expression(String str) {
		Stack<Character> stack = new Stack<Character>();
		char arr[]=str.toCharArray();
		for(int i =0; i<arr.length; i++) {
			checkOperator(arr[i]);
			
		}
		
		return -1;
	}
	
	public static boolean checkOperator(char ch) {
		
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
