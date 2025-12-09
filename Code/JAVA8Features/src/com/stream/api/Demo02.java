package com.stream.api;

import java.util.ArrayList;
import java.util.List;

public class Demo02 {
	public static void main(String[] args) {
		List<String> listOfCity = new ArrayList<>();
		listOfCity.add("Chh.Sambhajinagar");
		listOfCity.add("Pune");
		listOfCity.add("Mumbai");
		listOfCity.add("Hyderabad");
		
		listOfCity.forEach(System.out::println);

	}
}
