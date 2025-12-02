package com.nt.thread;

class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("user defined thread");
	}
}

public class Demo02 {

	public static void main(String[] args) {
		System.out.println("main thread started");
		MyThread t = new MyThread();
		t.start();
		System.out.println("main thread ended");

	}
}
