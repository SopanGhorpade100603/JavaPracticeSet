package com.nt.runnable;

public class Demo02 {

	public static void main(String[] args) {
//		anonymous inner class
		Runnable r = new Runnable() {

			@Override
			public void run() {
				System.out.println("user defined thread");
			}
		};

		Thread t = new Thread(r);
		t.start();

	}

}
