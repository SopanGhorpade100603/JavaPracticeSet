package com.nt.thread;
//getName setName
public class Demo04 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Thread t  = new Thread();
		System.out.println("current thred name: "+t.currentThread().getName());
		t.setName("patil thread");
		System.out.println("current thred name: "+t.getName());
	}

}
