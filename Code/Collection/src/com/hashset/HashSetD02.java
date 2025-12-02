package com.hashset;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetD02 {

	public static void main(String[] args) {
		HashSet<Object> hs = new HashSet<>();

		Boolean value[] = new Boolean[5];
		value[0] = hs.add(12);
		value[1] = hs.add(12);
		value[2] = hs.add(15);
		value[3] = hs.add(13);
		value[4] = hs.add(13);
		
		System.out.println(Arrays.toString(value));
	}
}
