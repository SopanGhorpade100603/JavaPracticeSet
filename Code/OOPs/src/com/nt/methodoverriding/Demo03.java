package com.nt.methodoverriding;

class A {
	int a = 10;
	void show() {
		System.out.println("A method");
	}
}

class B extends A {
	int a = 20;
	@Override
    void show() {
        System.out.println("B method");
    }
}

public class Demo03 {
	public static void main(String[] args) {
		A obj = new B(); // Upcasting (always safe)
		B b = (B) obj; // Downcasting (needs explicit cast)
		b.show();
	}
}
