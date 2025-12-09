package com.stream.api;

import java.util.Arrays;
import java.util.stream.Collectors;

	/*WAP to print all the names whose length is greater than
	3 from String array and convert into array */
public class ConvertIntoArray {

	public static void main(String[] args) {
		String names[] = { "ram", "sham", "sopan", "raj", "kartik", "ram", "rahul" };
		
		Object[] array = Arrays.stream(names).
											filter(n->n.length()>3).
																	toArray();
		
		System.out.println(Arrays.toString(array));
	}

}
