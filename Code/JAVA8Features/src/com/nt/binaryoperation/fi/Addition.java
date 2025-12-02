package com.nt.binaryoperation.fi;

import java.util.function.BinaryOperator;

public class Addition {

	public static void main(String[] args) {
		BinaryOperator<Integer> res = (x, y) -> x + y;
		System.out.println(res.apply(10, 20));
	}

}
