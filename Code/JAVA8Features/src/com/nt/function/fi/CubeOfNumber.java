package com.nt.function.fi;

import java.util.function.Function;

public class CubeOfNumber {

	public static void main(String[] args) {
		Function<Integer, Integer> cube = (num) -> num * num * num;
		System.out.println(cube.apply(5));
	}

}
