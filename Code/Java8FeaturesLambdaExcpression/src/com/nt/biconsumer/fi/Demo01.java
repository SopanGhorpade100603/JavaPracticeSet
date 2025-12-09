package com.nt.biconsumer.fi;

import java.util.function.BiConsumer;

public class Demo01 {
	public static void main(String[] args) {
		BiConsumer<Integer, String> res = (x,y)->{
			System.out.println(x*x);
			System.out.println(y.toUpperCase());
		};
		
		res.accept(5, "Sopan");
		
	}
}
