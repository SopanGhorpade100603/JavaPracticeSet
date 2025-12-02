package com.optionalclass;

import java.util.Optional;

public class OptionalD01 {

	public static void main(String[] args) {
		String str = null;

		Optional<String> ofNullable = Optional.ofNullable(str);
		
		if(ofNullable.isPresent()) {
			System.out.println(ofNullable.get());
		}else {
			System.err.println("no value in the container");
		}
	}

}
