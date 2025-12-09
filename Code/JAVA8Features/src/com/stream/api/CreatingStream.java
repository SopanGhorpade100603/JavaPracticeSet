package com.stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStream {
	public static void main(String[] args) {
		
//		two ways to crates stream 1.of  2.stream
		
		Stream<Integer> of = Stream.of(1,2,3,4,5);
		of.forEach(System.out::println);
		
		List<Integer> al = new ArrayList<>();
		al.add(1); al.add(2); al.add(3); al.add(4);
		
		Stream<Integer> stream = al.stream();
		stream.forEach(System.out::println);
	}

}
