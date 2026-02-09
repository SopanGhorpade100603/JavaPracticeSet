package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//WAP to collect the first letter or every word
public class FlatMapD02 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sun","Orange","Pen","Apple","Nose");
	 Object[] arr = names.
						 stream().
								flatMap(n->Stream.of(n.charAt(0))).
																 toArray();
		
		System.out.println(Arrays.toString(arr));
		
	}

}
