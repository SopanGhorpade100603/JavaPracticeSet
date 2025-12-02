package com.creationandmethods;

public class Demo02 {

	public static void main(String[] args) {
		String s1 = "sopan";
		String s2 = "sopan";
		String s3 = new String("sopan");

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);

		String s4 = s1.toUpperCase();
		System.out.println(s1 == s4);
		System.out.println("s1 hashcode: " + s1.hashCode() + " : " + " s4 hashcode: " + s4.hashCode());
	}

}
