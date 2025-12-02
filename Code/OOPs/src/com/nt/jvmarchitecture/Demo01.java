package com.nt.jvmarchitecture;

public class Demo01 {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Class cls = Demo01.class;
		System.out.println(cls.getName()); // give FQN name
		System.out.println(cls.getSimpleName()); // give class name
	}

}
