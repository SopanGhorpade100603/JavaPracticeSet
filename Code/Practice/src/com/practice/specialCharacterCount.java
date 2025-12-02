package com.practice;

public class specialCharacterCount {

	public static int specalCharacterCounter(String str) {
		int count = 0;
		String lower = str.toLowerCase();
		char[] toCharArray = lower.toCharArray();
		for (char ch : toCharArray) {
			if (ch != ' ' && !(ch >= 'a' && ch <= 'z')) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String str = "S@p!pa$W*hy&Q%']";
		int specalCharacterCounter = specalCharacterCounter(str);
		System.out.println("Special Character in String is: " + specalCharacterCounter);
	}

}
