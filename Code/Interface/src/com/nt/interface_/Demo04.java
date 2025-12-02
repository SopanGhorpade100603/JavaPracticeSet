package com.nt.interface_;

interface Alpha {
	void m1();
}

interface Beta {
	void m1();
}

class MultipleInheritance implements Alpha, Beta {

	@Override
	public void m1() {
		System.out.println("multiple inheritance is possible uaing inheritance");
	}

}

public class Demo04 {

	public static void main(String[] args) {
		MultipleInheritance mi = new MultipleInheritance();
		mi.m1();
	}
}
