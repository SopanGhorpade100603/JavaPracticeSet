package com.string.logical;

import java.util.HashMap;
import java.util.Map;

/*Write a program to print Highest occurred
character from given String?
Ex: aaaaabbcddddd Output: a */

public class HighestOcuuranceChars {

	public static void main(String[] args) {
		String str = "aaaaababcddddd";
		char occuredChar = getHighestOccuredChar(str);
		System.out.println(occuredChar);
	}

	public static char getHighestOccuredChar(String str) {
		 Map<Character, Integer> map = new HashMap<>();
		    char result = ' ';
		    int max = 0;

		    for (char ch : str.toCharArray()) {
		        int count = map.getOrDefault(ch, 0) + 1;
		        map.put(ch, count);

		        if (count > max) {
		            max = count;
		            result = ch;
		        }
		    }
		    
		    return result;
	}

}
