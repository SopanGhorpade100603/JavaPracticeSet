package com.practice;

public class CountVowelsAndConsonent {
	public static void main(String[] args) {
		String str = "rani mazya malya madhe gussul kay";
		str = str.toLowerCase();
		int vowels = 0, consonents = 0;
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
//					|| str.charAt(i) == 'u') {
//				vowels++;
//			} else {
//				consonents++;
//			}
//		}

		for (char ch : str.toCharArray()) {
			if ("aeiou".contains(ch+"")) {
				vowels++;
			} else {
				consonents++;
			}
		}

		System.out.println("vowels: " + vowels);
		System.out.println("consoneny: " + consonents);

	}

}
