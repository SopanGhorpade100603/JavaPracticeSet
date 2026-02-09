package com.nt.runnable;

public class Demo02UsingAnnonymousinnerClass {

	public static void main(String[] args) {
//		anonymous inner class
		Runnable r = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("hello sopan");
				}
			}
		};

		Thread t = new Thread(r);
		t.start();

	}

}
