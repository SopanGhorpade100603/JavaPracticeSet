package com.nt.wrapper;

public class Autoboxing {
	public static void main(String[] args) {
//		before java 1.5v
		int i=15;
		Integer I = Integer.valueOf(i);
		System.out.println(I);
		
//		after java 1.5v
		int x = 10;
//		x= null; //Type mismatch: cannot convert from null to int
		Integer y =x;
		System.out.println(y);
		y=null;
		System.out.println(y);
		
//		before java 1.5v
		byte b = 20;
		Byte bb = Byte.valueOf(b);
		System.out.println(bb);
		
//		after java 1.5v
		Byte bbb = b;
		bbb = null;
		System.out.println(bbb);
		
		Integer n = 12;
		String str = n.toString();
		str = str+2;
		System.out.println(str);
		
		String s = "123";
		Integer num = Integer.parseInt(s); //OR
		Integer nn = Integer.valueOf(s);  //before java 1.5v
		System.out.println(num);  
		System.out.println(nn);
		
	}

}
