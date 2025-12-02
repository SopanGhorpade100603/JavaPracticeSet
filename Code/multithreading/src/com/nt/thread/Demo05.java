package com.nt.thread;
//sleep method
public class Demo05 {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Thread t = new Thread();
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				t.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
