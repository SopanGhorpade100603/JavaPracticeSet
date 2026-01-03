package com.string.logical;

/* Write a program to remove the duplicate
characters from the given String?
Ex: banaans Output: bans */

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		String str = "banaans";
		String res = removeDuplicate(str);
		System.out.println(res);
		
//		using java8
//		str.chars().distinct().mapToObj(c->(char)c).forEach(System.out::print);
	}

	public static String removeDuplicate(String str) {
		String uniqueString = "";
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			if (str.charAt(i) != ' ') {
				for (int j = i + 1; j < str.length(); j++) {
					if (str.charAt(i) == str.charAt(j)) {
						count++;
					}
				}
				if (count == 0) {
					uniqueString += str.charAt(i);
				}
			}
		}
		return uniqueString;
	}

}
