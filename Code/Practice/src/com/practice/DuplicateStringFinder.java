package com.practice;

import java.util.HashMap;

public class DuplicateStringFinder {
	public static void main(String[] args) {
		String arr[] = { "sopan", "ram", "sham", "ram", "sopan", "gopal" };
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		for (String str : arr) {
			hm.put(str, hm.getOrDefault(str, 0) + 1);
		}

		System.out.print("duplicate values are: ");
		hm.forEach((k, v) -> {
			if (v > 1) {
				System.out.print(k + " ");
			}
		});
		
//		System.out.print("Duplicate found: ");
//		Set<String> set = new HashSet<>();
//		for(String s: arr) {
//			if(!set.add(s)) 
//				System.out.print(s+" ");
//		}
	
	}

}
