package com.nt;

sealed class Bird permits Parrot, Peagon {
	void fly() {
		System.out.println("generic birds");
	}
}

non-sealed class Parrot extends Bird {
	@Override
	public void fly() {
		System.out.println("parrot bird flying");
	}
}

final class Peagon extends Bird {
	@Override
	public void fly() {
		System.out.println("peagon bird flying");
	}
}

public class Demo01 {
public static void main(String[] args) {
	Bird b = new Parrot();
	b.fly();
}
}
