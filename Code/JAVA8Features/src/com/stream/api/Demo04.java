package com.stream.api;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//WAP to collect all even number from list
public class Demo04 {

	public static void main(String[] args) {
		List<Integer> of = List.of(1, 2, 3, 4, 5, 5, 6, 7, 8, 1, 4, 5, 2);

		System.out.println("without stream api");
		ArrayList<Integer> al = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		for (Integer i : of) {
			if (i % 2 == 0) {
				al.add(i);
				set.add(i);
			}
		}

		System.out.println(al);
		System.out.println("unique elements: "+set);
		
		System.out.println("---------------------------------");
		
		System.out.println("with stream api");
			of.stream().
						distinct().
									filter(n->n%2==0).
														forEach(n->System.out.print(n+" "));

	}

}
