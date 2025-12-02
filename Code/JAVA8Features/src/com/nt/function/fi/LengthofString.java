package com.nt.function.fi;

import java.util.function.Function;

public class LengthofString {

	public static void main(String[] args) {
		Function<String, Integer> len =  (String str) -> str.length();
		System.out.println(len.apply("Sopan"));
	}

}
