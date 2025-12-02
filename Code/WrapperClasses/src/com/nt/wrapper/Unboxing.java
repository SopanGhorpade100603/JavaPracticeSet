package com.nt.wrapper;

public class Unboxing {
	
	public static void main(String[] args) {
//		before java 1.5v
		Integer i =23;
		int ii = i.intValue();
//		ii = null;	//Type mismatch: cannot convert from null to int
		System.out.println(ii);
		
//		after java 1.5v
		Integer x = 22;
		int y = x;
		System.out.println(y);
		
//		before java 1.5v
		Byte m = 12;
		byte n = m.byteValue();
		System.out.println(n);
		
//		after java 1.5v
		Byte b =45;
		byte bb = b;
		System.out.println(bb);
		
		Double d = 20D;
		double dd = d;
		System.out.println(dd);
		
	}

}
