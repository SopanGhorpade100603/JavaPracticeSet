package com.nt.jvmarchitecture;

/* WAp to show application class loader is responsible to load the user defined class */

public class Demo02 {

	public static void main(String[] args) {
		Class cls = Demo02.class;
		System.out.println(cls.getClassLoader());
		System.out.println(cls.getClassLoader().getName());
		
		/* platform class loader is super class of application class loader */
		
		System.out.println();
		System.out.println(cls.getClassLoader().getParent());
		System.out.println(cls.getClassLoader().getParent().getName());

		/* Bootstrap class loader is super class of platform class loader */
		System.out.println(cls.getClassLoader().getParent().getParent());
	}

}
