package com.identityhashmap;

public class SystemHashcode {

	public static void main(String[] args) {
		String str1 = "Sopan";
		String str2 = "Sopan";

		System.out.println("Override hashcode from String class");
		System.out.println(str1.hashCode()+" : "+str2.hashCode());

		System.out.println("System hashcode value from the Object class");
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}

}
