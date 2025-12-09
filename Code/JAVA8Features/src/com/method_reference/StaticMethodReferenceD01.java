package com.method_reference;

import java.util.function.Consumer;

class Test{
	static void msg(String msg) {
		System.out.println(msg+" enjoy your weekend");
	}
}

public class StaticMethodReferenceD01 {
	public static void main(String[] args) {
		Consumer<String> cons = Test::msg;
		cons.accept("hello everone");
	}

}
