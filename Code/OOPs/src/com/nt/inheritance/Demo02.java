package com.nt.inheritance;

class Super {

	private int id;
	private String name;

	public void setData(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}

class Sub extends Super {

	public void getData() {
		System.out.println("id: " + getId());
		System.out.println("name: " + getName());
	}

}

public class Demo02 {

	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.setData(101, "sopan");
		sub.getData();

	}

}
