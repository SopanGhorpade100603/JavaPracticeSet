package com.nt.array;

import java.util.Arrays;

public class JNIEncodingStandard {
	public static void main(String[] args) {
		int [] i = new int[5];
		System.out.println("for int: "+i.getClass().getName());

		byte [] b = new byte[5];
		System.out.println("for byte: "+b.getClass().getName());

		short [] s = new short[5];
		System.out.println("for short: "+s.getClass().getName());

		char [] c = new char[5];
		System.out.println("for char: "+c.getClass().getName());

		long [] l = new long[5];
		System.out.println("for long: "+l.getClass().getName());
		
		boolean [] bb = new boolean[5];
		System.out.println("for boolean: "+bb.getClass().getName());
		
		double [] d = new double[5];
		System.out.println("for double: "+d.getClass().getName());
		
		float [] f = new float[5];
		System.out.println("for float: "+f.getClass().getName());

		String[] str = new String[5];
		System.out.println("for String: "+str.getClass().getName());

		Object[] obj = new Object[5];
		System.out.println("for Object: "+obj.getClass().getName());
		
	}

}
