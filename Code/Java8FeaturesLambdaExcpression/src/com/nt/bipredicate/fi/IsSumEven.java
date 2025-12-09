package com.nt.bipredicate.fi;

import java.util.function.BiPredicate;

public class IsSumEven {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> isSumEven = (a,b)->(a+b)%2==0;
		System.out.println(isSumEven.test(2,3));
		System.out.println(isSumEven.test(3,3));
	}

}
