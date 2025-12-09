package com.nt.functionalinterface_lambdaexpression;

@FunctionalInterface
interface Capitalize {
	public void upperCaseLetter(String str);
}

@FunctionalInterface
interface Length {
	public int calculateLength(String str);
}

public class Demo04 {

	public static void main(String[] args) {
		Capitalize name = (str) -> System.out.println(str.toUpperCase());
		name.upperCaseLetter("SopanGhorpade");

		Length len = (str) -> str.length();
		int length = len.calculateLength("SopanGhorpade");
		System.out.println(length);
	}

}
