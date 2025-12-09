package com.nt.predicate.fi;

import java.util.function.Predicate;

public class IsNameStartWithS {

	public static void main(String[] args) {
	Predicate<String> isStart =	(name)-> name.startsWith("s");
	boolean name = isStart.test("sopan");
	System.out.println("does name start with s: "+name);
	}

}
