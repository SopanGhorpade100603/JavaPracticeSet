package com.stream.api;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyCount {

	public static void main(String[] args) {
		String str = "i love java and i love coding";
		String[] split = str.split(" ");

		Map<String, Integer> hm = new HashMap<>();
		for (String s : split) {
			hm.put(s, hm.getOrDefault(s, 0) + 1);
		}

//		hm.forEach((k,v)->System.out.println(k+" ->"+v));

		Map<String, Long> freq = Arrays.stream(split).
													collect(Collectors.groupingBy(s -> s, Collectors.counting()));
		
		freq.forEach((k, v) -> System.out.println(k + " -> " + v));
	}

}
