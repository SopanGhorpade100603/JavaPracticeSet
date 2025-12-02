package com.creationandmethods;

public class Demo03charAt {

	public static void main(String[] args) {
		String str = "Chhatrapati Sambhajinagar";
		char ch = str.charAt(3);
		System.out.println("String: "+str);
		System.out.println("3rd char: " + ch);
		ch = str.charAt(0);
		System.out.println("0th char: " + ch);
		ch = str.charAt(str.length() - 1);
		System.out.println("last char: " + ch);

	}

}
