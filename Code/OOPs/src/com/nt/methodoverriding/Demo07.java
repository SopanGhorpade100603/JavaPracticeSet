package com.nt.methodoverriding;

class Super{
	public static void m1() {
		System.out.println("super m1()");
	}
}

class Sub extends Super{
	public static void m1() {
		System.out.println("sub m1()");
	}
}

public class Demo07 {
	public static void main(String[] args) {
		Super s = new Sub();
		s.m1();
	}

}
