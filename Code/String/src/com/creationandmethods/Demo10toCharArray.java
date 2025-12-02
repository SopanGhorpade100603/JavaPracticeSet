package com.creationandmethods;

public class Demo10toCharArray {

	public static void main(String[] args) {
		String str = "Chhatrapati Sambhajinagar";
		char[] chars = str.toCharArray();
		for (Character ch : chars) {
			System.out.print(ch + " ");
		}

	}

}
