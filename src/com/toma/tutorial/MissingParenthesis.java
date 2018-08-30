package com.toma.tutorial;

import java.util.Stack;

public class MissingParenthesis {

	
	public static String missingPararnthesis(String expression) {
		String result ="";
		Stack<Character> stack = new Stack<Character>();
		char [] arr = expression.toCharArray();
		for(int i = 0; i<arr.length; i++) {
			if(checkIfOpen(arr[i])) {
				stack.add(arr[i]);
			} else if(checkIfClosed(arr[i])) {
				stack.pop();
			}
			
		}
		while(!stack.isEmpty())	{
			if(stack.pop()=='(') {
				result+=')';
			}		
		}
		
		return result;
	}
	
	private static boolean checkIfOpen(char ch){
		if(ch=='(') {
			return true;
		}
		
		return false;
	}
	private static boolean checkIfClosed(char ch){
		if(ch==')') {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(missingPararnthesis("– 2+3( * ( 3 + 5(sasdfasdfasd)"));

	}

}
