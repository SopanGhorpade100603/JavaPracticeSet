package com.nt.runnable;

class MyThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i + " by " + Thread.currentThread().getName() + " thread");
		}
	}
}

public class Demo01 {
	public static void main(String[] args) {
		Thread t = new Thread(new MyThread());
		t.start();
	}

}
