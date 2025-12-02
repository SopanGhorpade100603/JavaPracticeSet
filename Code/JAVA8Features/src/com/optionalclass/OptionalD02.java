package com.optionalclass;

import java.util.Optional;

public class OptionalD02 {
	public static void main(String[] args) {
		Integer i = null;
		
		Optional<Integer> ofNullable = Optional.ofNullable(i);
	
//		System.out.println(ofNullable.get());	//NoSuchElementException
		Integer orElse = ofNullable.orElse(0);
		System.out.println(orElse);
		
//		String str = "sopan";
		String str =null;
		Optional<String> optionalContainer = Optional.ofNullable(str);
		System.out.println(optionalContainer.orElse("no value in the container"));
		
	}

}
