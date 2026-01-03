package com.practice;

public class CognizangQuestion {

	public static void main(String[] args) {
		String str = "ABC120PME0000LZMB1YD4563MD";

		StringBuilder character = new StringBuilder();
		StringBuilder number = new StringBuilder();

		for (char c : str.toCharArray()) {
			if (Character.isUpperCase(c)) {	// c>='A'&& c<='Z'
				character.append(c);
			} else if (Character.isDigit(c)) {
				number.append(c);
			}
		}

		System.out.print(character);
		System.out.println(number);

	}

}
