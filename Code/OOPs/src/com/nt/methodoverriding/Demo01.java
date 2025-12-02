package com.nt.methodoverriding;

class Animal{
	void sleep() {
		System.out.println("generic animal is sleeping");
	}
}

class Dog extends Animal{
	void sleep() {
		System.out.println("dog is sleeping");
	}
}

class Lion extends Animal{
	void sleep() {
		System.out.println("lion is sleeping");
	}
}

public class Demo01 {
public static void main(String[] args) {
	Animal a = new Dog();		//upcasting
	a.sleep();
	Animal aa = new Lion(); //upcasting
	aa.sleep();
	
}
}
