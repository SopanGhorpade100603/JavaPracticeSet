package com.defaultforeachmethod;

import java.util.List;

/*it is a default method available inside java.lang.iterator, java.lang.stream interface 
from java8. it is introduced to support functional programming using lambda expression
internally it uses forEach loop*/

public class DEmo01 {
	public static void main(String[] args) {
		List<String> list = List.of("Sopan","raj","sham");
		list.forEach(System.out::println);
	}

}
