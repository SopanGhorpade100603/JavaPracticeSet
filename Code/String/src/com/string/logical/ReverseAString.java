package com.string.logical;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
//write a code to reverse a String

public class ReverseAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		reverseString(str);
		sc.close();
	}

//	private static void reverseString(String str) {
//		for (int i = str.length()-1; i >= 0; i--) {
//			System.out.print(str.charAt(i)+" ");
//		}
//	}

//	private static void reverseString(String str) {
//		StringBuilder sb = new StringBuilder(str);
//		String rev = new StringBuilder(str).reverse().toString();
//		System.out.println(rev);
//	}

//	using stream api
	private static void reverseString(String str) {
		String rev = IntStream.
						range(0, str.length()).
											boxed().
											sorted(Comparator.reverseOrder()).
																			map(i->String.valueOf(str.charAt(i))).
																												collect(Collectors.joining());
		System.out.println(rev);
	}

}
