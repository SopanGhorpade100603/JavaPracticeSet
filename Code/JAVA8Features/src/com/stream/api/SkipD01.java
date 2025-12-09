package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SkipD01 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sun","Orange","Pen","Apple","Nose");
		Stream<String> skip = names.stream().skip(2);
		skip.forEach(System.out::println);
	}

}
