package com.nt.innerclass;

class Super{
	void show() {
		System.out.println("Super.show()");
	}
}

public class Demo01 {
	public static void main(String[] args) {
		Super sub = new Super() {
			@Override
			void show() {
				System.out.println("sub class show method");
			}
		};
		sub.show();
	}

}
