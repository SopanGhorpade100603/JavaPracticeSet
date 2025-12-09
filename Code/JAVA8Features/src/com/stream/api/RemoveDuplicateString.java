package com.stream.api;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("ram", "sham", "sopan", "raj", "kartik", "ram", "rahul", "sopan");
		names.stream().
					distinct().
							forEach(System.out::println);
	}

}
