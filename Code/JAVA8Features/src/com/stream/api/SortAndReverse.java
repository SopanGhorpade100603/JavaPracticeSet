package com.stream.api;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortAndReverse {

	public static void main(String[] args) {
		List<String> asList = Arrays.asList("Ravi","Amit","Sneha","Pooja","Kiran");
		
		Object[] array = asList.stream().sorted().toArray();
		System.out.println(Arrays.toString(array));

		Object[] array2 = asList.stream().sorted((s1,s2)->s2.compareTo(s1)).toArray();
		System.out.println(Arrays.toString(array2));
		
		
	}

}
