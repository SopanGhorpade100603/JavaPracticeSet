package com.nt.consumer.fi;

import java.util.function.Consumer;

public class Capitalize {
	public static void main(String[] args) {
		Consumer<String> name = (str)->System.out.println(str.toUpperCase());
		name.accept("sopan");
	}

}
