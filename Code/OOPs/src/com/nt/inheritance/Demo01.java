package com.nt.inheritance;

class Parent {
	public void house() {
		System.out.println("3 BHK house");
	}
}

class Child extends Parent {
	public void car() {
		System.out.println("fortuner car");
	}
}

public class Demo01 {

	public static void main(String[] args) {
		Child c = new Child();
		c.house();
		c.car();

	}

}
