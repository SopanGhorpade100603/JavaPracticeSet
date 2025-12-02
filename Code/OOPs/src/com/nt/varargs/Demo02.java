package com.nt.varargs;

public class Demo02 {

	public void m1(Object... obj) {
		for (Object num : obj) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Demo02 d = new Demo02();
		d.m1("SOpan", null, 12, true, 34.5, new String("ghorpade"));
	}

}
