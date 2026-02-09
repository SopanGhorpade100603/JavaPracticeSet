package com.nt.enum_;

import java.util.Arrays;

enum Colors{
	RED,GREEN,BLUE
}
public class Demo01 {

	public static void main(String[] args) {
		Colors[] values = Colors.values();
		System.out.println(Arrays.toString(values));

		System.out.println("Order position of red: "+Colors.RED.ordinal());
		System.out.println("Order position of green: "+Colors.GREEN.ordinal());
		
	}

}
