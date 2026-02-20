package com.nt.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

class Test {
	private String name;
	private int id;

	private Test() {

	}
	private void dis() {

	}
}

public class Demo01 {
	public static void main(String[] args) {
		Class<?> cls = null;
		try {
			cls = Class.forName("com.nt.reflection.Test");

			Constructor<?> constructor[] = cls.getDeclaredConstructors();
			System.out.println(Arrays.toString(constructor));
			
			Field[] fields = cls.getDeclaredFields();
			for(Field f : fields) {
				System.out.println(f.getName());
			}
			System.out.println();
			
			Method[] methods = cls.getMethods();
			for(Method m : methods) {
				System.out.println(m.getName());
			}
			

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
