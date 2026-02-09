package com.stream.api;

import java.util.Arrays;
import java.util.List;
//WAP to Find a String from list which are start with s
public class Demo12FindStringStartWithS {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("ram", "sham", "sopan", "raj", "kartik", "ram", "sonal", "sopan");
		names.stream().
					distinct().
								filter(str->str.toLowerCase().charAt(0)=='s').
																			forEach(System.out::println);
	}

}
