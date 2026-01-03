package com.string.logical;

/* Write a program to remove the given Character
from the given String?
Ex: nacre Software
Remove character: a
Output: ncre Softwre */

public class RemoveGivenChars {

	public static void main(String[] args) {
		String str = "nacre Software";
		char removeChar = 'a';
		String res = newString(str, removeChar);
		System.out.println(res);
	}

	public static String newString(String str, char removeChar) {
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != removeChar)
				res += str.charAt(i);
		}
		return res;
	}

}
