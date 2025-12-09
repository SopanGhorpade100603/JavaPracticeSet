package com.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo01 {
	public static void main(String[] args) {
		ArrayList<String> listofCity = new ArrayList<>();
		listofCity.add("Pune");
		listofCity.add("Hyd");
		listofCity.add("Chh.Sambhajinagar");
		listofCity.add("Mumbai");
		listofCity.add("Jalna");
		
		listofCity.stream ().forEach(System.out::println);
		
		Stream<Integer> of = Stream.of(1,2,3,4,5);
//		of.forEach(System.out::println);
		
//		how to generate infinite stream
		Stream<Double> limit = Stream.generate(()->(Math.random()*10)+1).limit(10);
		limit.forEach(System.out::println);
		
		Stream<Integer> infinite1 = Stream.iterate(1,n->n+1);
//		infinite1.limit(10).forEach(System.out::println);
			
	}
}
