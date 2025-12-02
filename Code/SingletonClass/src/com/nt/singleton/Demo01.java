package com.nt.singleton;

class Printer {
	private static Printer INSTANCE;

	private Printer() {
		System.out.println("Printer 0-param constructor");
	}

//	static factory method having singleton logic

	public static Printer getInstance() {
		if (INSTANCE == null) {
			return INSTANCE = new Printer();
		}
		return INSTANCE;
	}

	public void priintMsg(String msg) {
		System.out.println(msg);
	}

}

public class Demo01 {

	public static void main(String[] args) {
		Printer printer = Printer.getInstance();
		Printer printer1 = Printer.getInstance();
		System.out.println(printer.hashCode());
		System.out.println(printer1.hashCode());
		System.out.println(printer == printer1);

	}
}
