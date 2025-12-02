package com.nt.bifunction.fi;

import java.util.function.BiFunction;

public class DEmo01 {
	public static void main(String[] args) {
		BiFunction<String, String, String> res = (str1,str2)-> str1+str2;
		System.out.println(res.apply("Sopan", "Ghorpade"));
	}

}
