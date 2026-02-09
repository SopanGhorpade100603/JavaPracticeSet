package com.string.logical;

import java.util.Arrays;

//check if two string are anagram or not

public class AnagramString {
	public static void main(String[] args) {
		String str = "listen";
		String str2 = "silent";

		/*
		  if (str.length() != str2.length()) {
		   System.out.println("Not Anagram");
		  return;
		   }
		 
		  char[] ch1 = str.toCharArray();
		  char[] ch2 = str2.toCharArray();
		 
		  Arrays.sort(ch1); // sort to compare characters one by one
		  Arrays.sort(ch2);
		  
		  if (Arrays.equals(ch1, ch2)) {
		   System.out.println("anagram"); 
		   } else {
		  System.out.println("not");
		   } */
		
//		using java8
		boolean isAnagram = Arrays.equals(str.chars().sorted().toArray(), str2.chars().sorted().toArray());
		System.out.println(isAnagram ? "Anagram" : "Not Anagram");
	}

}
