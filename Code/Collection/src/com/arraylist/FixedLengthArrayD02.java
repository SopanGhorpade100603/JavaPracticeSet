package com.arraylist;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class FixedLengthArrayD02 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sopan","Raj","Kartik","Akshay","john");
		ListIterator<String> listItr = names.listIterator();
		System.out.println("forward direction:");
		while(listItr.hasNext()) {
			System.out.println(listItr.next());
		}
		
		System.out.println("\nbackward direction");
		while(listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}
	}

}
