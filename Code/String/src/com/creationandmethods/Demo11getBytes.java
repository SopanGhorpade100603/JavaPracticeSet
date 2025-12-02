package com.creationandmethods;

public class Demo11getBytes {

	public static void main(String[] args) {
		String str = "abcde";
		byte[] bytes = str.getBytes();
		for (byte b : bytes) {
			System.out.print(b + " ");
		}

	}

}
