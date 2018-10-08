package com.toma.tutorial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Example {

	public static char checkDuplicates(String entry) {
		char ch = ' ';
		ArrayList<Character> list = new ArrayList<Character>();
//		int[] checker = new int[str.length];
		for (int i = 0; i<entry.length();i++) {
			if(list.contains(entry.charAt(i))) {
				return entry.charAt(i);
			} else {
				list.add(entry.charAt(i));
			}
		}
		
		return ch;
	}

	
	public static char checkDuplicatesA(String entry) {
		
		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i<entry.length();i++) {
			if(set.contains(entry.charAt(i))) {
				return entry.charAt(i);
			} else {
				set.add(entry.charAt(i));
			}
		}
		
		return '0';
	}
	
	public static void main(String[] args) {
		System.out.println(checkDuplicatesA("masge"));

	}

}
