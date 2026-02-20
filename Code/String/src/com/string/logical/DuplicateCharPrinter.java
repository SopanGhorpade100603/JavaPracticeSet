package com.string.logical;

import java.util.HashSet;
import java.util.Set;

	/* Write a program to print duplicate characters
	from the given String?
	Ex: Programming Output: r, g, m */

public class DuplicateCharPrinter {

	public static void main(String[] args) {
		String str = "programming";
//		List<Character> printer = duplicatePrinter(str);
//		System.out.println(printer);

		Set<Character> duplicates = duplicatePrinter(str);
		System.out.println(duplicates);
	}

	/*
	  public static List<Character> duplicatePrinter(String str) {
	  HashMap<Character, Integer> hm = new HashMap<>();
	  List<Character> ll = new ArrayList<>();
	  
	  for (char s : str.toCharArray()) {
	   hm.put(s, hm.getOrDefault(s, 0) + 1); 
	   }
	   
	  System.out.print("duplicate values are: ");
	  hm.forEach((k, v) -> { 
	  					if (v > 1){
	   					ll.add(k); 
	   					}
	   				});
	   
	    	return ll;
	    } */

	public static Set<Character> duplicatePrinter(String str) {
		Set<Character> set = new HashSet<>();
		Set<Character> unique = new HashSet<>();
		for (char s : str.toCharArray()) {
			if (!set.add(s)) {
				unique.add(s);
			}
		}
		return unique;
	}

}
