package com.nt.oops;

class Dog {

	String name;
	double height;
	int age;

	public Dog() {
		super();
	}

	/* setting value using parameterized constructor */
//	public Dog(String name, double height, int age) {
//		super();
//		this.name = name;
//		this.height = height;
//		this.age = age;
//	}

	/* setting value using mom-static block */
	{
		name = "rony";
		height = 2.5;
		age = 14;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", height=" + height + ", age=" + age + "]";
	}

}

public class Demo01 {
	public static void main(String[] args) {
//		Dog d1 = new Dog("tommy", 3.6, 12);

		Dog d1 = new Dog();

		/* setting value using obj reference */
//		d1.name = "tommy";
//		d1.height = 3.5;
//		d1.age = 10;

		System.out.println(d1);
	}

}
