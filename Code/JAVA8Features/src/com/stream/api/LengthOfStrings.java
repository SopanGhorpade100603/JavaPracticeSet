package com.stream.api;

import java.util.Arrays;
import java.util.List;

public class LengthOfStrings {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("sopan","ravi","sham","ram","abhishek");
		System.out.println(names);
		names.
			stream().
					map(String :: length).
										forEach(n->System.out.print(n+" "));

	}

}
