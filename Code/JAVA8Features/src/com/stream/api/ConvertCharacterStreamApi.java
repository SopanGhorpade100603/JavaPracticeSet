package com.stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ConvertCharacterStreamApi {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("sopan");
		list.add("kartik");
		list.add("raj");
		list.add("abhi");
		list.add("john");

		list.stream().map(name -> Character.
									toUpperCase(name.charAt(0)) 
															+ name.substring(1)).toList()
															.forEach(System.out::println);
		;
	}
}
