package com.nt.abtraction;

abstract class Animal {
	public String name;

	public Animal(String name) {
		this.name = name;
	}

	public abstract void checkup();
}

class Lion extends Animal {

	public Lion(String name) {
		super(name);
	}

	@Override
	public void checkup() {
		System.out.println(name + " Lion is going for regular checkup..");
	}
}

class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	@Override
	public void checkup() {
		System.out.println(name + " dog is going for regular checkup...");
	}
}

public class Demo03 {
	public static void main(String[] args) {
		Animal lion = new Lion("simba");
		lion.checkup();

		Animal dog = new Dog("tommy");
		dog.checkup();
	}
}
