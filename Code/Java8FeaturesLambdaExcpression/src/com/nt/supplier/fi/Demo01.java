package com.nt.supplier.fi;

import java.util.function.Supplier;

public class Demo01 {
	public static void main(String[] args) {
		Supplier<String> str = () -> "100" + 200;
		System.out.println(str.get());
	}
}
