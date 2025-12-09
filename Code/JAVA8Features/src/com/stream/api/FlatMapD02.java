package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapD02 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sun","Orange","Pen","Apple","Nose");
		List<Character> collect = names.
			stream().
					flatMap(n->Stream.of(n.charAt(0))).
													collect(Collectors.toList());
		
		System.out.println(collect);
		
	}

}
