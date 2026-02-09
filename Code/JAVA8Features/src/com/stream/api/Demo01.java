package com.stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
/*two ways to crates stream 
		  1.of 
		  2.stream
 */
public class Demo01 {
	public static void main(String[] args) {
		
		Stream<Integer> of = Stream.of(1,2,3,4,5);
//		of.forEach(System.out::println);
		
		List<String> listOfCity = new ArrayList<>();
		listOfCity.add("Chh.Sambhajinagar");
		listOfCity.add("Pune");
		listOfCity.add("Mumbai");
		listOfCity.add("Hyderabad");
		
		listOfCity.stream().forEach(System.out::println);
		System.out.println();
		listOfCity.parallelStream().forEach(System.out::println);

	}
}
