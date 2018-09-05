package com.toma.tutorial;

import java.util.Stack;

public class ReverseStack {

	public static Stack<Integer> reverseStack(Stack<Integer> first){
//		Integer var= null;
		Stack<Integer> second = new Stack<>();
		while(!first.isEmpty()) {
//			var = first.pop();
			second.add(first.pop());
		}
				
		return second;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> second = new Stack<>();
		second.add(7);
		second.add(6);
		second.add(5);
		second.add(4);
		second.add(3);
		second.add(2);
		second.add(1);
		System.out.println(second.toString());
		
//		 reverseStack(second);
		System.out.println(reverseStack(second).toString());
		
	}

}
