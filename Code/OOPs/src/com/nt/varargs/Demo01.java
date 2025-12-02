package com.nt.varargs;

public class Demo01 {
	
	public void m1(int ...x) {
		for(Integer num: x) {
			System.out.print(num+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Demo01 d = new Demo01();
		d.m1(1,2,3,4,5,6,7,8);

	}

}
