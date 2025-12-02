package com.nt.methodoverriding;

class Animal1 {
	void eat() {
		System.out.println("generic animal is eating");
	}
}

class Cat extends Animal1 {
	@Override
	void eat() {
		System.out.println("dog is eating");
	}
}

class Tiger extends Animal1 {
	@Override
	void eat() {
		System.out.println("lion is eating");
	}
}

public class Demo02 {
	public static void main(String[] args) {
		Animal1 a = null;

		a = new Cat(); // dynamic method dispatch
		a.eat();

		a = new Tiger();
		a.eat();

	}
}
