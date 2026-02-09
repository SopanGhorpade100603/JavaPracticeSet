package com.stream.api;

import java.util.Arrays;
	/*WAP to print all the names whose length is greater than
	3 from String array and convert into array */
public class Demo06ConvertToarray {

	public static void main(String[] args) {
		String names[] = { "ram", "sham", "sopan", "raj", "kartik", "ram", "rahul" };
		
		Object[] array = Arrays.stream(names).
											filter(n->n.length()>3).
																	toArray();
		
		System.out.println(Arrays.toString(array));
	}

}
