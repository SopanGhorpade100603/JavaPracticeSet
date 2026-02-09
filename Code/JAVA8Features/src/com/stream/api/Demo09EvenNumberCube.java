package com.stream.api;

import java.util.List;

//WAP to print cube of even number and remove duplicate

public class Demo09EvenNumberCube {
	public static void main(String[] args) {
		List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,2,3,4,6);
		list.stream().
					distinct().
							  filter(n->n%2==0).
												map(n->n*n*n).
															forEach(System.out::println);
	}

}
