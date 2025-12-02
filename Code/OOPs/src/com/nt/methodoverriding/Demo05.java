package com.nt.methodoverriding;

class Animal2 {
	void roam() {
		System.out.println("generic animal roaming");
	}
}

class Dog1 extends Animal2 {
	@Override
	void roam() {
		System.out.println("dog is roaming");
	}
}

class Cat1 extends Animal2 {
	@Override
	void roam() {
		System.out.println("cat is roaming");
	}
}

public class Demo05 {

	public static void main(String[] args) {
		Animal2 animal = null;
		animal = new Dog1();
		checkAnimal(animal);

		animal = new Cat1();
		checkAnimal(animal);

	}

	private static void checkAnimal(Animal2 a) {
		a.roam();
	}

}
