package com.nt.methodoverloading;

class Cons {

	public Cons() {
		System.out.println("0-param constructor");
	}

	public Cons(int a) {
		System.out.println(a + " param constructor");
	}

	public Cons(int a, int b) {
		System.out.println(a + " " + b + " param constructor");
	}

	public Cons(double a) {
		System.out.println(a + "2-param constructor");
	}

	public Cons(double a, double b) {
		System.out.println(a + " " + b + "param constructor");
	}

	public Cons(String str) {
		System.out.println(str+" param constructor");
	}

}

public class Constructoroverloading {
	public static void main(String[] args) {
		Cons c = new Cons();
		Cons cc = new Cons(10);
		Cons ccc = new Cons(10,20);
		Cons cccc = new Cons(10.5);
		Cons ccccc = new Cons(12.2,34);
		Cons cccccc = new Cons("sopan");
		
	}

}
