package com.nt.enum_;
//in enum static block always execute after constructor

import java.util.Arrays;

enum Direction {
	EAST, WEST, NORTH, SOUTH;

	static {
		System.out.println("static block");
	}

	private Direction() {
		System.out.println("constructor");
	}
}

public class Demo04 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(Direction.values()));
	}

}
