package com.stream.api;

import java.util.Arrays;
import java.util.List;
//print element which are exactly divided by 7
public class Demo03PrintEleThatDivide7 {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(2,7,14,12,20,21,24,27,28,32,35,40);
		
		asList.stream().
					filter(n->n%7==0).
									forEach(System.out::println);
		
	}

}
