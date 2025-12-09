package com.nt.unaryoperator.fi;

import java.util.function.UnaryOperator;

public class Square {

	public static void main(String[] args) {
		UnaryOperator<Integer> square = x->x*x;
		System.out.println(square.apply(5));
	}

}
