package com.toma.tutorial;

import java.util.Stack;

public class EvaluateExpression {

	public static int expression(String str) {
		Stack<Integer> stack = new Stack<Integer>();
		char arr[] = str.toCharArray();
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			
			 if(checkIfMultipleOperator(arr[i])) {
				 sum+=stack.pop()*(arr[i+1]-'0');	
				 i++;
			 }  else if(arr[i]>'0' && arr[i]<('9'+1)){
				 stack.add(arr[i]-'0');
			 }
		}
		while(!stack.isEmpty()) {
			sum += stack.pop();
		}

		return sum;
	}

	public static boolean checkIfMultipleOperator(char ch) {
		if (ch == '*') {
			return true;
		}

		return false;
	}
	

	public static void main(String[] args) {
	System.out.println(expression("5+4*1+3+4*4") );

	}

}
