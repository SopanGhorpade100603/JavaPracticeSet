package com.vector;

import java.util.Collections;
import java.util.Vector;

public class VectorD06 {

	public static void main(String[] args) {
		Vector<Integer> numbers = new Vector<>();
		numbers.add(14);
		numbers.add(12);
		numbers.add(11);
		numbers.add(12);
		numbers.add(45);
		numbers.add(41);
		
		numbers.forEach(System.out::println);
		
		Collections.sort(numbers);
		System.out.println("\u001B[35m"+"\nsorting data[ascending]");
		System.out.println(numbers.toString());
		
		Collections.sort(numbers.reversed());
		System.out.println("\u001B[36m"+"\nsorting data[descending]");
		System.out.println(numbers.toString());

	}
}
