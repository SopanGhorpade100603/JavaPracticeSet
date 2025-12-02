package com.nt.method_reference;

import java.util.Vector;

class OddEven {
	public static void oddEven(int num) {
		System.out.println(num % 2 == 0 ? "true" : "false");
	}
}

public class StaticMethodReferenceD02 {

	public static void main(String[] args) {

		Vector<Integer> nums = new Vector<>();
		nums.add(2);
		nums.add(5);
		nums.add(6);
		nums.add(9);

//		by using lambda
//		nums.forEach(n->OddEven.oddEven(n));

		nums.forEach(OddEven::oddEven);

	}

}
