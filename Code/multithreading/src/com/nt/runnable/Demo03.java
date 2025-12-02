package com.nt.runnable;

public class Demo03 {

	public static void main(String[] args) {
		Runnable r =()->{
			System.out.println("user defined thread");
		};
		
		Thread t = new Thread(r);
		t.start();

	}

}
