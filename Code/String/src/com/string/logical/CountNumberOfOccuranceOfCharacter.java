package com.string.logical;

import java.util.HashMap;
import java.util.Map;

/* Write a program to count the number of
	occurrences of each character in a string?
	Ex: apple
	Output: a-1 p-2 l-1 e-1 */

public class CountNumberOfOccuranceOfCharacter {

	public static void main(String[] args) {
		String str = "apple";
		Map<Character, Integer> occurace = getOccurace(str);
		occurace.forEach((k,v)->System.out.println(k+" "+v));
	}
	
	public static Map<Character,Integer> getOccurace(String str){
		Map<Character,Integer> hm = new HashMap<>();
		for(char ch: str.toCharArray()) {
			hm.put(ch, hm.getOrDefault(ch, 0)+1);
		}
		return hm;
	}

}
