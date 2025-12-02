package com.nt.interface_;

interface Alpha1{
	public default void m1() {
		System.out.println("interface method");
	}
}

class Beta1 {
	public void m1() {
		System.out.println("concreate method of class");
	}
}

class PrioprityComparison extends Beta1 implements Alpha1{

	public void show() {
		m1();
//	Alpha1.super.m1();
	}
}

public class Demo05 {
	public static void main(String[] args) {
		PrioprityComparison pc = new PrioprityComparison();
		pc.show();
	}

}
