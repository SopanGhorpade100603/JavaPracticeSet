package com.nt.function.fi;

import java.util.Arrays;
import java.util.function.Function;

public class CharacterArray {
	public static void main(String[] args) {
		Function<String, char[]> arr = (str) -> str.toCharArray();
		System.out.println(Arrays.toString(arr.apply("SopanGhorpade")));
	}

}
