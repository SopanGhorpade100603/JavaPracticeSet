package com.nt.functionalinterface_lambdaexpression;

@FunctionalInterface
interface Animal {
//	only one abstract method OR SAM[single abstract method]
	public void makeSound();
}

class Dog implements Animal {
	@Override
	public void makeSound() {
		System.out.println("Dog are barking");
	}
}

public class Demo01 {
	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.makeSound();

//		anonymous inner class
		Animal lion = new Animal() {
			@Override
			public void makeSound() {
				System.out.println("Lion are roaring");
			}
		};
		
		lion.makeSound();
	}

}
