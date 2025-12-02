package com.practice;

//count the total vowels in given String
 
public class VowelsCount {

	public static int countVowels(String str) {
		char[] charArray = str.toCharArray();
		int count = 0;
		for (Character ch : charArray) {
			if (ch != ' ' && ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String str = "welcome to java";
		int countVowels = countVowels(str);
		System.out.println(countVowels(str) == 0 ? "no vowels" : "total vowels: " + countVowels(str)); // ternary
																										// operator
		System.out.println("total vowels in String is: " + countVowels);
	}
}
