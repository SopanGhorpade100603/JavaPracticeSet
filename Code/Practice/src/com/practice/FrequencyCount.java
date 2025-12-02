package com.practice;

import java.util.HashMap;

public class FrequencyCount {
	public static void main(String[] args) {

		HashMap<Character, Integer> hm = new HashMap<>();
		String str = "hii folks welcome to naresh it";

		char[] charArray = str.toCharArray();

		for (char ch : charArray) {
			hm.put(ch, hm.getOrDefault(ch, 0) + 1);
		}
		System.out.println("i occures in: "+hm.get('i')+" times");
	}

}
