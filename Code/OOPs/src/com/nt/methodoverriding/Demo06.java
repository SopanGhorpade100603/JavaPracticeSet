package com.nt.methodoverriding;

class Animal3 {
	public void roam() {
		System.out.println("generic animal");
	}
}

class Dog2 extends Animal3 {
	@Override
	public void roam() {
		System.out.println("dot animal roaming");
	}

	void bark() {
		System.out.println("dog barking");
	}
}

class Lion2 extends Animal3 {
	@Override
	public void roam() {
		System.out.println("lion animal roaming");
	}

	void roar() {
		System.out.println("lion is roaring");
	}
}

public class Demo06 {

	public static void main(String[] args) {
	Animal3 animal = null;
	animal = new Dog2();
	chechAnimal(animal);
	
	animal = new Lion2();
	chechAnimal(animal);
	}
	
	private static void chechAnimal(Animal3 a) {
		if(a instanceof Dog2 ) {
			a.roam();
			((Dog2) a).bark();
		}else if(a instanceof Lion2) {
			a.roam();
			((Lion2) a).roar();
		}
	}

}
