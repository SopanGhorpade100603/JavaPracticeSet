package com.nt.shallowcopy;

/* - in shallow copy we will create only one object and same existing object will be 
 * referred by multiple reference variable.
 * - in shallow copy if we modify the content of one object by any of one reference 
 * variable then original object will be modified  
 */

class Laptop {
	String name;
	double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Laptop(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [name=" + name + ", price=" + price + "]";
	}
}

public class ShallowCopy {
	public static void main(String[] args) {
		Laptop l1 = new Laptop("Dell", 58000);
		Laptop l2 = l1;
		System.out.println("======before change============");
		System.out.println(l1);
		System.out.println(l2);
		
		l2.setName("hp");
		l2.setPrice(55000);
		System.out.println("\n======after change============");
		System.out.println(l2);
		System.out.println(l1);
	}

}
