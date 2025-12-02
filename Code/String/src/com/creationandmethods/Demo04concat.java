package com.creationandmethods;

public class Demo04concat {
	public static void main(String[] args) {
		String str = "Chhatrapati";
		String str1 = "Sambhajinagar";
		String str2 = str.concat(str1); // OR
		String str3 = str + str1;
		System.out.println(str2);
		System.out.println(str3);
	}

}
