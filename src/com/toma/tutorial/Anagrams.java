package com.toma.tutorial;

import java.util.HashMap;

public class Anagrams {

	public static boolean ifAnagram(String strA, String strB) {
//		check length, if they have different size, they are not an anagram
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < strA.length(); i++) {
			if (map.containsKey(strA.charAt(i))) {
				map.put(strA.charAt(i), map.get(strA.charAt(i)) + 1);
			} else {
				map.put(strA.charAt(i), 1);
			}
		}

		for (int i = 0; i < strB.length(); i++) {
			if (map.containsKey(strB.charAt(i))) {
				map.put(strB.charAt(i), map.get(strB.charAt(i)) - 1);
				if (map.get(strB.charAt(i)) == 0) {
					map.remove(strB.charAt(i));
				}
			}
		}
		if (map.isEmpty()) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ifAnagram("program", "grampoz"));
	}

}
