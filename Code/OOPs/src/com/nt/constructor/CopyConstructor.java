package com.nt.constructor;

class Laptop {
	String name;
	double price;

	public Laptop(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public Laptop(Laptop lap) {
		this.name = lap.name;
		this.price = lap.price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [name=" + name + ", price=" + price + "]";
	}

}

public class CopyConstructor {
	public static void main(String[] args) {
		Laptop l1 = new Laptop("dell", 58000);
		Laptop l2 = new Laptop(l1);
		System.out.println(l1);
		System.out.println(l2);

		System.out.println("-------------------------");
		l2.setName("HP");
		l2.setPrice(54000);
		System.out.println(l1);
		System.out.println(l2);
	}

}
