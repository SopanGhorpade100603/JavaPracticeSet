package com.nt.abtraction;

/*abstract class constructor initialize through child class constructor */

abstract class A {
	A() {
		System.out.println("A.A()");
	}
}

class B extends A {

	B() {
		System.out.println("B.B()");
	}
}

public class Demo02 {

	public static void main(String[] args) {
		A a = new B();

	}

}
