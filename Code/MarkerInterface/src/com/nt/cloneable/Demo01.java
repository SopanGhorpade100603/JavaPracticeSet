package com.nt.cloneable;

class Customer implements Cloneable {
	int id;
	String name;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
}

public class Demo01 {

	public static void main(String[] args) {
		Customer c1 = new Customer(101, "Sopan");
		System.out.println(c1);

		Customer c2 = null;

		try {
//			Object clone = c1.clone();
			c2 = (Customer) c1.clone();
			System.out.println(c2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		c2.setId(105);
		c2.setName("raj");

		System.out.println("\nafter modifying data");
		System.out.println(c1);
		System.out.println(c2);
	}
}

/*
 * the main purpose of marker interface is to provide additional information
 * regarding object to jvm i.e object is cloneable,serializable,OR randomly
 * accessible without this information jvm will not allow to perform operation
 * on these object
 */
