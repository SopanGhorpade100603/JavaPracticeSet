package com.nt.bipredicate.fi;

import java.util.function.BiPredicate;

public class Demo01 {
	public static void main(String[] args) {
		BiPredicate<String, Integer> res = (x,y)-> {
			return x.length() == y;
		};
		
		boolean test = res.test("Sopan", 5);
		System.out.println(test);
	}

}
