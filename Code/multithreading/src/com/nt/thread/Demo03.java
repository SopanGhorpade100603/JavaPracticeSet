package com.nt.thread;
//we can't guess thread execution order
class UserThread extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println("user defined thread: " + i + " name of thread: " + currentThread().getName());
		}
	}
}

public class Demo03 {

	public static void main(String[] args) {
		UserThread ut = new UserThread();
		ut.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("main thread: " + i + " name of thread: " + Thread.currentThread().getName());
		}
	}

}
