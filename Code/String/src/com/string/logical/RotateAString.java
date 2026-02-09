package com.string.logical;

public class RotateAString {

	public static void main(String[] args) {
		String str = "abcd";
		String rotateLeft = leftRotate(str, 1);
		System.out.println(rotateLeft);
		String rightRotate = rightRotate(str, 1);
		System.out.println(rightRotate);

	}

	public static String leftRotate(String str, int rotateCount) {
		int n = str.length();
		int k = rotateCount % n;
		return str.substring(k) + str.substring(0, k);
	}

	public static String rightRotate(String str, int rotateCount) {
		int n = str.length();
		int k = rotateCount % n;
		return str.substring(n - k) + str.substring(0, n - k);
	}

}
