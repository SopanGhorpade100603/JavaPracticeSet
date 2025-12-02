package com.nt.thread;

public class Demo01 {
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println("name of the current thread is: "+thread.getName());
	}

}
