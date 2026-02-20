package com.nt.reflection;

import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class D02 {
	
	private int id;
	private String name;
	
	private void show() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private D02() {
		super();
		System.out.println("D02.D02()");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		try {
			Class cls = Class.forName("com.nt.reflection.D02");
			
			Method[] allmethods = cls.getMethods();
//			System.out.println(Arrays.toString(allmethods));
			System.out.println("\u001B[32m"+"all available methods");
			for(Method m: allmethods) {
				System.out.println(m.getName());
			}
			
			System.out.println();
			System.out.println("\u001B[34m"+"all available fields");
			
			Field[] allFields = cls.getDeclaredFields();
			for(Field f: allFields) {
				System.out.println(f.getName());
			}
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
