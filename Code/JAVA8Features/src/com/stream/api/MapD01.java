package com.stream.api;

import java.util.List;
//fetch all the unique elements and find the cube of those number
public class MapD01 {
	public static void main(String[] args) {
		List<Integer> of = List.of(1,2,3,4,5,5,6,7,8,1,4,5,2);
		
		of.stream().
					filter(n->n%2==0).
									distinct().
											map(n->n*n).
													forEach(System.out::println);
		
	}

}
