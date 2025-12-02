package com.nt.inheritance;

class Alpha {

	public void Display() {
		System.out.println("Alpha.Display()");
	}
}

class Beta extends Alpha {

	@Override
	public void Display() {
		System.out.println("Beta.showBalance()");
		super.Display();
	}
}

public class Demo04 {

	public static void main(String[] args) {
		Beta beta = new Beta();
		beta.Display();
	}

}
